package com.upgrad.hirewheels.entities;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Data
@Getter
@Setter
@Entity
public class Location {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="location_id",columnDefinition = "NUMBER(10)")
    private int id;

    @Column(name = "location_name",nullable = false,length=50)
    private String locationName;

    @Column(nullable = false,length=100)
    private String address;


    @Column(nullable = false,columnDefinition = "CHAR(6)")
    private String pincode;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "city_id")
    private City city;

    @OneToOne
    private Vehicle vehicle;

    @OneToMany(mappedBy = "location")
    List<Booking> bookings;

    public Location(){}



    public Location(String locationName, String address, String pincode) {
        this.locationName = locationName;
        this.address = address;
        this.pincode = pincode;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
