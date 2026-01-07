package com.day04.edumentorapplication;

// Base class for all platform users
public abstract class User {

    protected int userId;
    protected String name;
    protected String email;

    // constructor
    public User(int userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
    }

    // method to be overridden to display details
    protected abstract void printDetails();
}
