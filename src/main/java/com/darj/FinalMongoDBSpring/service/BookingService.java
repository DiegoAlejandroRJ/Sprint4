package com.darj.FinalMongoDBSpring.service;

import com.darj.FinalMongoDBSpring.dto.BookingDto;
import com.darj.FinalMongoDBSpring.dto.BookingResponseDto;
import com.darj.FinalMongoDBSpring.model.Booking;

import java.util.List;
import java.util.Optional;

public interface BookingService {
    List<BookingResponseDto> getAllBookings();
    Optional<Booking> findBookingById(String id);
    Booking findByEmail(String email);
    BookingResponseDto createBooking(BookingDto bookingDto);
    Boolean updateBooking(String id, BookingDto bookingDto);
    Boolean deleteBooking(String id);
}
