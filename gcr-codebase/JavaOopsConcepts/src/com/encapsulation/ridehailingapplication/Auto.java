package com.encapsulation.ridehailingapplication;

public class Auto extends Vehicle implements GPS {

    private String location;

    // Constructor to initialize auto
    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.location = "Not Set";
    }

    // Fare calculation for auto with base charge
    @Override
    public double calculateFare(double distance) {
        return (getRatePerKm() * distance) + 30;
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
