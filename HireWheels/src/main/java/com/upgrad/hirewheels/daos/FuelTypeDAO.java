package com.upgrad.hirewheels.daos;

import com.upgrad.hirewheels.entities.FuelType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuelTypeDAO extends JpaRepository<FuelType,Integer> {
}
