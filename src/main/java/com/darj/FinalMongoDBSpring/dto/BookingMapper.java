package com.darj.FinalMongoDBSpring.dto;

import com.darj.FinalMongoDBSpring.model.Booking;

public class BookingMapper {
    public static BookingResponseDto bookingToBookingResponseDto(Booking booking){
        return new BookingResponseDto(
                booking.getId(),
                booking.getUserName(),
                booking.getUserEmail(),
                booking.getCreatedBookingAt(),
                booking.getStartingBookingDate(),
                booking.getFinishingBookingDate()
        );
    }

    public static Booking bookingDtoToBooking(BookingDto bookingDto){
        return new Booking(
                bookingDto.getId(),
                bookingDto.getUserName(),
                bookingDto.getUserEmail(),
                bookingDto.getCreatedBookingAt(),
                bookingDto.getStartingBookingDate(),
                bookingDto.getFinishingBookingDate()
        );
    }
}
