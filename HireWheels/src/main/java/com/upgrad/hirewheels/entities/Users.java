package com.upgrad.hirewheels.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Data
@Getter
@Setter
@Entity
public class Users {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="user_id",columnDefinition = "NUMBER(10)")
    private int id;

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


    @Column(name="wallet_money",columnDefinition = "NUMBER(10,2) DEFAULT 10000.00")
    private int walletMoney;

    @ManyToOne(cascade =CascadeType.REMOVE ,fetch = FetchType.EAGER)
    @JoinColumn(name="roleid")
    private Role role;



    @OneToMany(mappedBy = "user")
    List<Booking>bookings;


    public Users(){}



    public Users(String firstName, String lastName, String password, String email, String mobileNo, int walletMoney) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.mobileNo = mobileNo;
        this.walletMoney = walletMoney;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
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


    public int getWalletMoney() {
        return walletMoney;
    }

    public void setWalletMoney(int walletMoney) {
        this.walletMoney = walletMoney;
    }


}
