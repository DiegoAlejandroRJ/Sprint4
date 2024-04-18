package com.darj.FinalMongoDBSpring.controller;

import com.darj.FinalMongoDBSpring.dto.BookingDto;
import com.darj.FinalMongoDBSpring.dto.BookingResponseDto;
import com.darj.FinalMongoDBSpring.exceptions.BookingNotFoundException;
import com.darj.FinalMongoDBSpring.exceptions.UserNotFoundException;
import com.darj.FinalMongoDBSpring.model.Booking;
import com.darj.FinalMongoDBSpring.dto.BookingDto;
import com.darj.FinalMongoDBSpring.service.BookingServiceMongoDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;

import static org.springframework.http.HttpStatus.*;

@RestController
@RequestMapping ("/v1/bookings/")
public class BookingController {

    private final BookingServiceMongoDb bookingService;

    public BookingController(BookingServiceMongoDb bookingService){
        this.bookingService = bookingService;
    }

    @PostMapping
    public ResponseEntity<BookingResponseDto> createBooking(@RequestBody BookingDto bookingDto){
        try{
            return new ResponseEntity<>(bookingService.createBooking(bookingDto), CREATED);
        } catch (RuntimeException e) {
            return new ResponseEntity("An error has occurred while retrieving bookings", INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping
    public ResponseEntity<List<BookingResponseDto>> getAllBookings() {
        try {
            List<BookingResponseDto> bookingResponseDtos = bookingService.getAllBookings();
            if (bookingResponseDtos.isEmpty()) {
                return new ResponseEntity<>(bookingResponseDtos, NO_CONTENT);
            }
            return new ResponseEntity<>(bookingService.getAllBookings(), OK);
        }catch (RuntimeException e) {
            return new ResponseEntity("An error has occurred while retrieving bookings", INTERNAL_SERVER_ERROR);
        }

    }
    /*  @GetMapping("/{id}")
    public ResponseEntity<BookingResponseDto> findBookingById(@PathVariable String id) {
        try {
            return new ResponseEntity<>(bookingService.findBookingById(id), OK);
        }catch (NoSuchElementException e){
            return new ResponseEntity("The booking " +  id + " doesn't exist in the database", NOT_FOUND);
        }
    }*/
    @PutMapping ("{id}")
    public ResponseEntity<Boolean> updateBooking(@PathVariable String id, @RequestBody BookingDto bookingDto){
        try {
            Boolean isUpdated = bookingService.updateBooking(id, bookingDto);
            if (isUpdated){
                return new ResponseEntity(true, OK);
            }else {
                return new ResponseEntity(false, NOT_FOUND);
            }

        }catch (NoSuchElementException e){
            return new ResponseEntity("The booking " + id + " doesn't exist in the data base", NOT_FOUND);
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteBooking(@PathVariable ("id") String id ){
        Optional<Booking> optionalBooking = bookingService.findBookingById(id);
        if (optionalBooking.isEmpty()){
            throw new BookingNotFoundException(id);

        }
        bookingService.deleteBooking(id);
        return ResponseEntity.ok("Delete successfully");
    }
}
