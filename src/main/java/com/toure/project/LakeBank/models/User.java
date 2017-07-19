package com.toure.project.LakeBank.models;

import org.hibernate.validator.constraints.Email;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by Alou on 7/12/2017.
 */

@Entity
public class User {

    @NotNull
    @Size(min = 4, max = 15, message = "Username must be between 6 and 15 characters long")
    private String username;
    @NotNull
    @Size(min = 6, max = 15, message = "Password must be between 6 and 15 characters long")
    private String password;
    @NotNull
    @Email(message = "Please enter a valid email address")
    private String email;
    @NotNull
    @Size(min = 9, max = 9)
    private int ssn;
    @NotNull
    @Size(min = 5, max = 5)
    private  int zip;
    @NotNull
    @Size(max = 30)
    private String firstName;
    @NotNull
    @Size(max = 30)
    private String lastName;
    @NotNull
    @Size(max = 50)
    private String address;
    @NotNull
    @Size(max = 30)
    private String city;
    private String state;
    @Size(max = 10)
    private String phone;

    public User(String username, String password, String email){
        this.username = username;
        this.password = password;
        this.email = email;

    }

    public User(){

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public int getSsn() { return ssn; }

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

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
