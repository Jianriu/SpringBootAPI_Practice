package com.tutorial.JavaSpringAPI.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//User model and table
@Entity
@Table(name="user_info") //create user_info table
public class User {

    private String name;
    @Id //indicates which one is the id field for the table
    private String userid;
    private String address;

    public User(){}

    public User(String name, String id, String address) {
        this.name = name;
        this.userid = id;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public String getUserid() {
        return userid;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public void setName(String name) {
        this.name = name;
    }
}
