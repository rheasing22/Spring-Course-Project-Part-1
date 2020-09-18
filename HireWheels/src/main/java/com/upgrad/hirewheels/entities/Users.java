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

    public Users(){}



    public Users(String firstName, String lastName, String password, String email, String mobileNo, int roleId, int walletMoney) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.mobileNo = mobileNo;
        this.roleId = roleId;
        this.walletMoney = walletMoney;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public int getWalletMoney() {
        return walletMoney;
    }

    public void setWalletMoney(int walletMoney) {
        this.walletMoney = walletMoney;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", roleId=" + roleId +
                ", walletMoney=" + walletMoney +
                '}';
    }
}
