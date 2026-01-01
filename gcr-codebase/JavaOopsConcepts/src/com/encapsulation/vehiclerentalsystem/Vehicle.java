package com.encapsulation.vehiclerentalsystem;

public abstract class Vehicle {

    private String vehicleNumber;
    private String type;
    private double rentalRate; // per day

    // Constructor to initialize vehicle details
    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Abstract method to calculate rental cost
    public abstract double calculateRentalCost(int days);

    // Concrete method to display vehicle details
    public void displayDetails() {
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Type           : " + type);
        System.out.println("Rate / Day     : " + rentalRate);
    }

    // Encapsulated accessors
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    protected double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }
}
