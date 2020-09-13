package com.upgrad.hirewheels.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Data
@Getter
@Setter
public class City {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="city_id",columnDefinition = "NUMBER(10)")
    private int cityId;

    @Column(name="city_name",nullable = false,length = 50)
    private String cityName;
}
