package com.day02.cabbygoapplication;

public class Driver {

    private String name;
    private String licenseNumber;
    private double rating;

    // constructor
    public Driver(String name, String licenseNumber, double rating) {
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.rating = rating;
    }

    // getter for name
    public String getName() {
        return name;
    }

    // getter for rating
    public double getRating() {
        return rating;
    }

    // display a driver
    public void displayDriver() {
        System.out.println("Driver Name    : " + name);
        System.out.println("License Number : " + licenseNumber);
        System.out.println("Rating         : " + rating);
    }
}
