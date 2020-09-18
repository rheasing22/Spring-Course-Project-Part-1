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
@Table(name="vehicle_category")
public class VehicleCategory {
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="vehicle_category_id")
    private int id;

    @Column(name="vehicle_category_name",nullable = false,unique = true,length = 50)
    private String vehicleCategoryName;

    @OneToMany(mappedBy = "vehicleCategory")
    List<VehicleSubcategory> vehicleSubcategories;

    public VehicleCategory(){}

    public VehicleCategory(String vehicleCategoryName) {
        this.vehicleCategoryName = vehicleCategoryName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVehicleCategoryName() {
        return vehicleCategoryName;
    }

    public void setVehicleCategoryName(String vehicleCategoryName) {
        this.vehicleCategoryName = vehicleCategoryName;
    }

    public List<VehicleSubcategory> getVehicleSubcategories() {
        return vehicleSubcategories;
    }

    public void setVehicleSubcategories(List<VehicleSubcategory> vehicleSubcategories) {
        this.vehicleSubcategories = vehicleSubcategories;
    }
}
