package com.encapsulation.ridehailingapplication;

public class Bike extends Vehicle implements GPS {

    private String location;

    // Constructor to initialize bike
    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.location = "Not Set";
    }

    // Fare calculation for bike (cheaper rate)
    @Override
    public double calculateFare(double distance) {
        return (getRatePerKm() * distance) * 0.85;
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.location = newLocation;
    }
}
