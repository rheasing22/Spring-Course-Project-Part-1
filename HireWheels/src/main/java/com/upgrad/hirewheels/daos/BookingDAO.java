package com.upgrad.hirewheels.daos;

import com.upgrad.hirewheels.entities.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("bookingDAO")
public interface BookingDAO extends JpaRepository<Booking,Integer> {

}
