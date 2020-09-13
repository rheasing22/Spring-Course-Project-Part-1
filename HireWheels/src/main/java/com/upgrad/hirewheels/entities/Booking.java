package com.upgrad.hirewheels.entities;



import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Getter
@Setter
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="booking_id",columnDefinition = "NUMBER(10)")
    private int bookingId;

    @Column(name="pickup_date",nullable = false)
    private Date pickupDate;

    @Column(name="dropoff_date",nullable = false)
    private Date dropOffDate;

    @Column(name="booking_date",nullable = false)
    private Date bookingDate;

    @Column(nullable = false,columnDefinition = "NUMBER(10,2)")
    private int amount;

    @Column(name="location_id",nullable = false)
    private int locationId;

    @Column(name="vehicle_id",nullable = false)
    private int vehicleId;

    @Column(name="user_id",nullable = false)
    private int userId;


}
