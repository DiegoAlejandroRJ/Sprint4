package com.darj.FinalMongoDBSpring.dto;

import java.util.Date;

public class BookingResponseDto {
    private String id;
    private String userName;
    private String userEmail;
    private Date createdBookingAt;
    private Date startingBookingDate;
    private Date finishingBookingDate;

    public BookingResponseDto(String id, String userName, String userEmail, Date createdBookingAt, Date startingBookingDate, Date finishingBookingDate) {
        this.id = id;
        this.userName = userName;
        this.userEmail = userEmail;
        this.createdBookingAt = createdBookingAt;
        this.startingBookingDate = startingBookingDate;
        this.finishingBookingDate = finishingBookingDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Date getCreatedBookingAt() {
        return createdBookingAt;
    }

    public void setCreatedBookingAt(Date createdBookingAt) {
        this.createdBookingAt = createdBookingAt;
    }

    public Date getStartingBookingDate() {
        return startingBookingDate;
    }

    public void setStartingBookingDate(Date startingBookingDate) {
        this.startingBookingDate = startingBookingDate;
    }

    public Date getFinishingBookingDate() {
        return finishingBookingDate;
    }

    public void setFinishingBookingDate(Date finishingBookingDate) {
        this.finishingBookingDate = finishingBookingDate;
    }
}
