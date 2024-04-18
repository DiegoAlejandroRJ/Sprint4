package com.darj.FinalMongoDBSpring.repository;

import com.darj.FinalMongoDBSpring.model.Booking;
import org.springframework.data.mongodb.repository.MongoRepository;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface BookingRepository extends MongoRepository<Booking, String> {
    Optional<Booking> findByEmail(String email);

    List<Booking> getAllBookings();

    Booking findBookingById(String id);

    Booking createBooking(Booking booking);

    Boolean updateBooking(String id, Booking booking);
}
