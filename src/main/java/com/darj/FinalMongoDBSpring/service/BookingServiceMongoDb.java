package com.darj.FinalMongoDBSpring.service;

import com.darj.FinalMongoDBSpring.dto.BookingDto;
import com.darj.FinalMongoDBSpring.dto.BookingMapper;
import com.darj.FinalMongoDBSpring.dto.BookingResponseDto;
import com.darj.FinalMongoDBSpring.model.Booking;
import com.darj.FinalMongoDBSpring.repository.mongo.BookingMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookingServiceMongoDb implements BookingService{
    private final BookingMongoRepository bookingMongoRepository;

    @Autowired
    public BookingServiceMongoDb(BookingMongoRepository bookingMongoRepository) {
        this.bookingMongoRepository = bookingMongoRepository;
    }

    @Override
    public List<BookingResponseDto> getAllBookings() {
        List<BookingResponseDto> bookingResponseDto = new ArrayList<>();
        bookingMongoRepository.findAll().forEach(booking -> bookingResponseDto.add(BookingMapper.bookingToBookingResponseDto(booking)));
        return bookingResponseDto;
    }



    @Override
    public Optional<Booking> findBookingById(String id) {
        return null;
    }

    @Override
    public Booking findByEmail(String email) {
        return null;
    }

    @Override
    public BookingResponseDto createBooking(BookingDto bookingDto) {
        return null;
    }

    @Override
    public Boolean updateBooking(String id, BookingDto bookingDto) {
        return null;
    }

    @Override
    public Boolean deleteBooking(String id) {
        return null;
    }
}
