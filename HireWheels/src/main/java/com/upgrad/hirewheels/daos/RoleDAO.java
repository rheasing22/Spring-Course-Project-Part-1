package com.upgrad.hirewheels.daos;

import com.upgrad.hirewheels.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("roleDAO")
public interface RoleDAO extends JpaRepository<Role,Integer> {
}
