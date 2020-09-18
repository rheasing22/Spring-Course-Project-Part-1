package com.upgrad.hirewheels.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Getter
@Setter
@Table(name="fuel_type")
public class FuelType {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="fuel_type_id",columnDefinition = "NUMBER(10)")
    private int id;

    @Column(name="fuel_type",nullable = false,unique = true,length=50)
    private String fuelType;

    @OneToMany(mappedBy = "fuelType")
    List<Vehicle> vehicles;

    //JPA needs this
    public FuelType(){}

    // paramterized constructor
    public FuelType(String fuelType) {
        this.fuelType = fuelType;
    }


    // Getters and setter

    public int getId() {
        return id;
    }

    public void setFuelTypeId(int fuelTypeId) {
        this.id = fuelTypeId;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
}
