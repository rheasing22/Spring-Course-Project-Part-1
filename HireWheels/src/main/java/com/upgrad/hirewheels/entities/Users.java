package com.upgrad.hirewheels.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Getter
@Setter
@Entity
public class Users {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="user_id",columnDefinition = "NUMBER(10)")
    private int userId;

    @Column(name = "first_name", nullable = false,length=50)
    private String firstName;

    @Column(name = "last_name",length=50)
    private String lastName;

    @Column(nullable = false, columnDefinition = "varchar(50) check( length(password)>5 )")
    private String password;

    @Column(nullable= false, unique=true,length=50)
    private String email;

    @Column(name = "mobile_no",nullable = false,unique = true,columnDefinition = "char(10)")
    private String mobileNo;

    @Column(name="role_id",nullable = false,columnDefinition = "NUMBER(10)")
    private int roleId;

    @Column(name="wallet_money",columnDefinition = "NUMBER(10,2) DEFAULT 10000.00")
    private int walletMoney;
}
