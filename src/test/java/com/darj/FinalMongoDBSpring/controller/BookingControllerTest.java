package com.darj.FinalMongoDBSpring.controller;

import com.darj.FinalMongoDBSpring.controller.user.UserController;
import com.darj.FinalMongoDBSpring.model.Booking;
import com.darj.FinalMongoDBSpring.service.BookingService;
import com.darj.FinalMongoDBSpring.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.eq;
import static org.springframework.data.mongodb.core.aggregation.ConditionalOperators.Switch.CaseOperator.when;
/*
class BookingsControllerTest {

    @Mock
    private BookingService bookingsService;

    @InjectMocks
    private BookingController bookingsController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }
    @Test
    public void testFindBookingByEMail_NotFound() {
        //Organizar test
        String nonExistingBookingId = "100";
        when(bookingsService.findByEmail(eq(nonExistingBookingId))).then(null);

        //actuar del test
        //ResponseEntity<Booking> responseEntity = bookingsController.findById(nonExistingBookingId);

        //afirmar el test
        assertEquals(HttpStatus.NOT_FOUND, responseEntity.getStatusCode());
    }


}

 */