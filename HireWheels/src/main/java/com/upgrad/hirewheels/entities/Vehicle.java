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
public class Vehicle {
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="vehicle_id",columnDefinition = "NUMBER(10)")
    private int id;

    @Column(name="vehicle_model",nullable = false,length=50)
    private String vehicleModel;

    @Column(name="vehicle_number",nullable = false,columnDefinition = "char(10)")
    private String vehicleNumber;


    @Column(nullable = false,length=50)
    private String color;


    @Column(name="availability_status",nullable = false, columnDefinition = "NUMBER(1)")
    private int availabilityStatus;

    @Column(name="vehicle_image_url",nullable = false,columnDefinition = "VARCHAR2(500)")
    private String vehicleImageUrl;

    @ManyToOne
    @JoinColumn(name="fuel_type_id")
    private FuelType fuelType;

    @ManyToOne
    @JoinColumn(name="vehicle_subcategory_id")
    private VehicleSubcategory vehicleSubcategory;

    @OneToOne
    @JoinColumn(name="locationid")
    private Location location;

    @OneToMany(mappedBy = "vehicle")
    List<Booking>bookings;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Vehicle() {
    }

    public Vehicle(String vehicleModel, String vehicleNumber, String color, int availabilityStatus, String vehicleImageUrl) {
        this.vehicleModel = vehicleModel;
        this.vehicleNumber = vehicleNumber;
        this.color = color;
        this.availabilityStatus = availabilityStatus;
        this.vehicleImageUrl = vehicleImageUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public int getAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(int availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    public String getVehicleImageUrl() {
        return vehicleImageUrl;
    }

    public void setVehicleImageUrl(String vehicleImageUrl) {
        this.vehicleImageUrl = vehicleImageUrl;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public VehicleSubcategory getVehicleSubcategory() {
        return vehicleSubcategory;
    }

    public void setVehicleSubcategory(VehicleSubcategory vehicleSubcategory) {
        this.vehicleSubcategory = vehicleSubcategory;
    }
}
