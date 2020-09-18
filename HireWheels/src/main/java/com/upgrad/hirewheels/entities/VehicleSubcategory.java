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
@Table(name = "vehicle_subcategory")
public class VehicleSubcategory {
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="vehicle_subcategory_id",columnDefinition ="NUMBER(10)" )
    private int id;

    @Column(name="vehicle_subcategory_name",nullable = false,unique = true,length=50)
    private String vehicleSubcategoryName;

    @Column(name="price_per_day",nullable = false,columnDefinition = "NUMBER(10,2)")
    private int pricePerDay;


    public VehicleSubcategory(){}

    @OneToMany(mappedBy = "vehicleSubcategory")
    List <Vehicle> vehicles;

    @ManyToOne
    @JoinColumn(name="vehicle_category_id")
    private VehicleCategory vehicleCategory;

    public VehicleSubcategory(String vehicleSubcategoryName, int pricePerDay) {
        this.vehicleSubcategoryName = vehicleSubcategoryName;
        this.pricePerDay = pricePerDay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVehicleSubcategoryName() {
        return vehicleSubcategoryName;
    }

    public void setVehicleSubcategoryName(String vehicleSubcategoryName) {
        this.vehicleSubcategoryName = vehicleSubcategoryName;
    }

    public int getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(int pricePerDay) {
        this.pricePerDay = pricePerDay;
    }



    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public VehicleCategory getVehicleCategory() {
        return vehicleCategory;
    }

    public void setVehicleCategory(VehicleCategory vehicleCategory) {
        this.vehicleCategory = vehicleCategory;
    }
}



