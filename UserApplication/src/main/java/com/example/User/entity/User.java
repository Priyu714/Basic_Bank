package com.example.User.entity;


import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;


@Document
public class User {

    @MongoId
    private Long id;

    private String name;
    private String mobilenumber;
    private String adharNumber;
    private Address address;
    private String email;
    private String gender;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public String getAdharNumber() {
        return adharNumber;
    }

    public void setAdharNumber(String adharNumber) {
        this.adharNumber = adharNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public User(Long id, String name, String mobilenumber, String adharNumber, Address address, String email, String gender) {
        this.id = id;
        this.name = name;
        this.mobilenumber = mobilenumber;
        this.adharNumber = adharNumber;
        this.address = address;
        this.email = email;
        this.gender = gender;
    }

    public User() {
    }
}
