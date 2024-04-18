package com.darj.FinalMongoDBSpring.repository.mongo;

import com.darj.FinalMongoDBSpring.model.Booking;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookingMongoRepository extends MongoRepository<Booking, String> {

    //List<Booking> getAllBookings();
    Optional<Booking> findByUserEmail(String email);

}