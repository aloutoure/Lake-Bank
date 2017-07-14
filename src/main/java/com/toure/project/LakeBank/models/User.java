package com.toure.project.LakeBank.models;

import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by Alou on 7/12/2017.
 */
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
}