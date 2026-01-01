package com.encapsulation.ridehailingapplication;

public class Car extends Vehicle implements GPS {

    private String location;

    // Constructor to initialize car
    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.location = "Not Set";
    }

    // Fare calculation for car
    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
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
