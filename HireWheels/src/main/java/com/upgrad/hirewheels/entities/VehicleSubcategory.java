package com.upgrad.hirewheels.entities;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Getter
@Setter
@Entity
@Table(name = "vehicle_subcategory")
public class VehicleSubcategory {
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="vehicle_subcategory_id",columnDefinition ="NUMBER(10)" )
    private int vehicleSubcategoryId;

    @Column(name="vehicle_subcategory_name",nullable = false,unique = true,length=50)
    private String vehicleSubcategoryName;

    @Column(name="price_per_day",nullable = false,columnDefinition = "NUMBER(10,2)")
    private int pricePerDay;

    @Column(name="vehicle_category_id",nullable = false,columnDefinition ="NUMBER(10)")
    private int vehicleCategoryId;
}



