package com.example.mcp_server_sse;

import com.example.mcp_server_sse.service.HotelBookingService;
import io.modelcontextprotocol.server.McpServerFeatures;
import io.modelcontextprotocol.server.McpSyncServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ai.mcp.McpToolUtils;
import org.springframework.ai.support.ToolCallbacks;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class McpServerApplication {

    McpSyncServer mcpSyncServer;

    private static final Logger logger = LoggerFactory.getLogger(McpServerApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(McpServerApplication.class, args);
    }

    // constructor
    public McpServerApplication(McpSyncServer mcpSyncServer) {
        this.mcpSyncServer = mcpSyncServer;
    }


    @GetMapping("/updateTools")
    public String greeting() {
        System.out.println("Update tools signal received!");
        List<McpServerFeatures.SyncToolSpecification> newTools = McpToolUtils
                .toSyncToolSpecifications(ToolCallbacks.from(new HotelBookingService()));

        for (McpServerFeatures.SyncToolSpecification newTool : newTools) {
            logger.info("Add new tool: " + newTool);
            mcpSyncServer.addTool(newTool);
            mcpSyncServer.notifyToolsListChanged();
        }
        return "Update signal received!";
    }
}
