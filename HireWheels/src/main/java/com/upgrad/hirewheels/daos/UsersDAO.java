package com.upgrad.hirewheels.daos;

import com.upgrad.hirewheels.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository("usersDAO")
public interface UsersDAO extends JpaRepository<Users,Integer> {


}
