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
public class Role {
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="role_id",columnDefinition = "NUMBER(10)")
    private int id;
    @Column(name="role_name",nullable = false,unique = true,length=50)
    private String roleName;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(name="user_role",joinColumns = @JoinColumn(name="roleid"),inverseJoinColumns = @JoinColumn(name="usersid"))
    List <Users> users;

    public Role(){}

    public Role(String roleName) {
        this.roleName = roleName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<Users> getUsers() {
        return users;
    }

    public void setUsers(List<Users> users) {
        this.users = users;
    }
}
