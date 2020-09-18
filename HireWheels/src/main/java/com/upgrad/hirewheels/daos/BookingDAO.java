package com.upgrad.hirewheels.daos;

import com.upgrad.hirewheels.entities.Booking;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookingDAO extends JpaRepository<Booking,Integer> {

}
