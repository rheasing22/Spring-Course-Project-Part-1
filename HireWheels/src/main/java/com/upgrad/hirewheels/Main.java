package com.upgrad.hirewheels;

import com.upgrad.hirewheels.daos.UsersDAO;
import com.upgrad.hirewheels.entities.Users;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.persistence.Column;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        // we get the bean and then save the user information

        UsersDAO usersDAO = (UsersDAO)context.getBean("usersDAO");
        Users users = usersDAO.save(new Users("rhea","singh","password","rhea@gmail.com","1234567891",1,10000));

        // we are displaying all the users

        List<Users> insertedUsers = usersDAO.findAll();
        insertedUsers.forEach(user -> System.out.println(user));




    }
}


