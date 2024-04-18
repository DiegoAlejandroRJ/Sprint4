package com.darj.FinalMongoDBSpring.repository.mongo;

import com.darj.FinalMongoDBSpring.model.Booking;
import com.darj.FinalMongoDBSpring.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
public class BookingRepositoryImpl implements BookingRepository{

    @Autowired
    private BookingMongoRepository bookingMongoRepository;

    @Override
    public List<Booking> getAllBookings() {
        return bookingMongoRepository.findAll();
    }

    @Override
    public Booking findBookingById(String id) {
        return bookingMongoRepository.findById(id).get();
    }

    @Override
    public Optional<Booking> findByEmail(String email) {
        Optional<Booking> bookingFound = bookingMongoRepository.findByUserEmail(email);
        if (bookingFound.isPresent()) {
            return bookingFound;
        } else {
            return Optional.empty();
        }
    }

    @Override
    public Booking createBooking(Booking booking) {
        return bookingMongoRepository.save(booking);
    }

    @Override
    public Boolean updateBooking(String id, Booking booking){
        Booking bookingFound = findBookingById(id);
        if (bookingFound != null) {
            bookingFound.updateBooking(booking);
            bookingMongoRepository.save(bookingFound);
            return true;
        } else {
           return false;
        }
    }

    public Boolean deleteBooking(String id) {
        Booking bookingFound = findBookingById(id);
        if(bookingFound != null) {
            bookingMongoRepository.delete(bookingFound);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public <S extends Booking> S insert(S entity) {
        return null;
    }

    @Override
    public <S extends Booking> List<S> insert(Iterable<S> entities) {
        return null;
    }

    @Override
    public <S extends Booking> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Booking> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Booking> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Booking> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Booking> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Booking> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Booking, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Booking> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Booking> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Booking> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public List<Booking> findAll() {
        return null;
    }

    @Override
    public List<Booking> findAllById(Iterable<String> strings) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(Booking entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends Booking> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Booking> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Booking> findAll(Pageable pageable) {
        return null;
    }
}