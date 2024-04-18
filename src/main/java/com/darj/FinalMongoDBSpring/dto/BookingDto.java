package com.darj.FinalMongoDBSpring.dto;

import com.darj.FinalMongoDBSpring.model.Booking;

import java.util.Date;

public class BookingDto extends Booking {
    private String id;
    private String dtoUserName ;
    private String dtoUserEmail;
    private Date dtoCreatedBookingAt;
    private Date dtoStartingBookingDate;
    private Date dtoFinishingBookingDate;

    public BookingDto(String id, String dtoUserName , String dtoUserEmail, Date dtoCreatedBookingAt, Date dtoStartingBookingDate, Date dtoFinishingBookingDate) {
        this.id = id;
        this.dtoUserName  = dtoUserName ;
        this.dtoUserEmail = dtoUserEmail;
        this.dtoCreatedBookingAt = dtoCreatedBookingAt;
        this.dtoStartingBookingDate = dtoStartingBookingDate;
        this.dtoFinishingBookingDate = dtoFinishingBookingDate;
    }


    public String getId(){return id;}
    public String getUserName(){ return dtoUserName ; }
    public String getUserEmail(){ return dtoUserEmail; }
    public Date getCreatedBookingAt(){ return dtoCreatedBookingAt; }
    public Date getStartingBookingDate(){ return dtoStartingBookingDate; }
    public Date getFinishingBookingDate() { return dtoFinishingBookingDate; }
}

