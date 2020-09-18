package com.upgrad.hirewheels;

import com.upgrad.hirewheels.daos.*;
import com.upgrad.hirewheels.entities.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.persistence.Column;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        // we get the bean and then save the user information

        UsersDAO usersDAO = (UsersDAO)context.getBean("usersDAO");
        Users users = usersDAO.save(new Users("Admin","Admin","admin@123","upgrad@gmail.com","9999999999",10000));

        RoleDAO roleDAO = (RoleDAO) context.getBean("roleDAO");
        Role role = roleDAO.save(new Role("Admin"));




        // mappings

        Users admin = usersDAO.findById(users.getId()).get();


        Role role1 = roleDAO.findById(role.getId()).get();

        admin.setRole(role1);
        usersDAO.save(admin);

        // displaying details of user with role Admin

        int admin_id =role1.getId();

     














    }
}


