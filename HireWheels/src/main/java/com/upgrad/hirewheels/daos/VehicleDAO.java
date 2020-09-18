package com.upgrad.hirewheels.daos;

import com.upgrad.hirewheels.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("vehicleDAO")
public interface VehicleDAO extends JpaRepository<Vehicle,Integer> {
}
