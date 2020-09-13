package com.upgrad.hirewheels.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Getter
@Setter
@Entity
public class Vehicle {
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="vehicle_id",columnDefinition = "NUMBER(10)")
    private int vehicleId;

    @Column(name="vehicle_model",nullable = false,length=50)
    private String vehicleModel;

    @Column(name="vehicle_number",nullable = false,columnDefinition = "char(10)")
    private String vehicleNumber;

    @Column(name="vehicle_subcategory_id",columnDefinition = "NUMBER(10)")
    private int vehicleSubcategoryId;

    @Column(nullable = false,length=50)
    private String color;

    @Column(name = "location_id",nullable = false,columnDefinition = "NUMBER(10)")
    private int locationId;

    @Column(name = "fuel_type_id",nullable = false,columnDefinition = "NUMBER(10)")
    private int fuelTypeId;

    @Column(name="availability_status",nullable = false, columnDefinition = "NUMBER(1)")
    private int availabilityStatus;

    @Column(name="vehicle_image_url",nullable = false,columnDefinition = "VARCHAR2(500)")
    private String vehicleImageUrl;


}
