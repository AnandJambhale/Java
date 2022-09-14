package com.springSecurities.SpringSecurities.models;

public class Users {

    String userName;

    String password;

    String email;

    public Users() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public Users(String userName, String password, String email) {
        this.userName = userName;
        this.password = password;
        this.email = email;
    }
}
