package com.upgrad.hirewheels.entities;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Getter
@Setter
@Entity
@Table(name="vehicle_category")
public class VehicleCategory {
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="vehicle_category_id")
    private int vehicleCategoryId;

    @Column(name="vehicle_category_name",nullable = false,unique = true,length = 50)
    private String vehicleCategoryName;
}
