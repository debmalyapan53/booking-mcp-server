package com.example.mcp_server_sse.model;

public class HotelBooking {
    private Long id;
    private String hotelName;
    private String location;
    private String checkInDate;
    private String checkOutDate;
    private String guestName;
    private String bookingRef;

    // Constructors
    public HotelBooking() {
    }

    public HotelBooking(Long id, String hotelName, String location, String checkInDate, String checkOutDate,
                        String guestName, String bookingRef) {
        this.id = id;
        this.hotelName = hotelName;
        this.location = location;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.guestName = guestName;
        this.bookingRef = bookingRef;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getBookingRef() {
        return bookingRef;
    }

    public void setBookingRef(String bookingRef) {
        this.bookingRef = bookingRef;
    }
}
