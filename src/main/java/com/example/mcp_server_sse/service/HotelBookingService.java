package com.example.mcp_server_sse.service;

import com.example.mcp_server_sse.model.HotelBooking;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class HotelBookingService {
    private final Map<Long, HotelBooking> bookings = new HashMap<>();

    public HotelBookingService() {
        // Initialize with dummy data
        initializeDummyData();
    }

    private void initializeDummyData() {
        HotelBooking booking1 = new HotelBooking(
                1L,
                "Hilton Garden Inn",
                "New York",
                "2024-06-15",
                "2024-06-20",
                "John Doe",
                "HOTEL123"
        );

        HotelBooking booking2 = new HotelBooking(
                2L,
                "Marriott Marquis",
                "San Francisco",
                "2024-07-01",
                "2024-07-05",
                "Jane Smith",
                "HOTEL456"
        );

        HotelBooking booking3 = new HotelBooking(
                3L,
                "Hyatt Regency",
                "Chicago",
                "2024-08-10",
                "2024-08-15",
                "Alice Johnson",
                "HOTEL789"
        );

        bookings.put(booking1.getId(), booking1);
        bookings.put(booking2.getId(), booking2);
        bookings.put(booking3.getId(), booking3);
    }

    @Tool(name = "get_all_hotel_bookings", description = "Get all hotel bookings")
    public List<HotelBooking> getAllBookings() {
        return new ArrayList<>(bookings.values());
    }
}