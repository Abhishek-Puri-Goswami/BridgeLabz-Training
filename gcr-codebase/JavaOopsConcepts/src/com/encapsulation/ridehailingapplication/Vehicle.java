package com.encapsulation.ridehailingapplication;

public abstract class Vehicle {

    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    // Constructor to initialize vehicle details
    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Abstract method to calculate fare
    public abstract double calculateFare(double distance);

    // Concrete method to display vehicle details
    public void getVehicleDetails() {
        System.out.println("Vehicle ID : " + vehicleId);
        System.out.println("Driver     : " + driverName);
        System.out.println("Rate / Km  : " + ratePerKm);
    }

    // Encapsulated accessors
    protected double getRatePerKm() {
        return ratePerKm;
    }
}
