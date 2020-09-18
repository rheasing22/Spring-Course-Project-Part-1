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
public class City {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="city_id",columnDefinition = "NUMBER(10)")
    private int id;

    @Column(name="city_name",nullable = false,length = 50)
    private String cityName;

    @OneToMany(mappedBy = "city",fetch = FetchType.EAGER)
    List<Location> locations;
    public City(){}

    public City(String cityName) {
        this.cityName = cityName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }
}
