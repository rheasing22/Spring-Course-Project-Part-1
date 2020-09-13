package com.upgrad.hirewheels.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Getter
@Setter
@Entity
public class Role {
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="role_id",columnDefinition = "NUMBER(10)")
    private int roleId;
    @Column(name="role_name",nullable = false,unique = true,length=50)
    private String roleName;
}
