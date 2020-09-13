package com.upgrad.hirewheels.entities;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Getter
@Setter
@Entity
public class Location {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="location_id",columnDefinition = "NUMBER(10)")
    private int locationId;

    @Column(name = "location_name",nullable = false,length=50)
    private String locationName;

    @Column(nullable = false,length=100)
    private String address;

    @Column(name="city_id",nullable = false)
    private int cityId;

    @Column(nullable = false,columnDefinition = "CHAR(6)")
    private String pincode;
}
/*
    location_id	NUMBER(10)	PRIMARY KEY
    location_name	VARCHAR2(50)	NOT NULL
    address	VARCHAR2(100)	NOT NULL
    city_id	NUMBER(10)	NOT NULL	FOREIGN KEY
    pincode	CHAR(6)	NOT NULL
*/