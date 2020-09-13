package com.upgrad.hirewheels.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Data
@Getter
@Setter
@Table(name="fuel_type")
public class FuelType {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="fuel_type_id",columnDefinition = "NUMBER(10)")
    private int fuelTypeId;

    @Column(name="fuel_type",nullable = false,unique = true,length=50)
    private String fuelType;

}
