package com.day05.parkeaseapplication;

// Bike-specific charge calculation
public class Bike extends Vehicle {

	// constructor
    public Bike(String vehicleNumber) {
        super(vehicleNumber, "Bike");
    }

    // method to calculate total charges
    @Override
    public double calculateCharges(int hours) {
        double baseRate = 20;
        double penalty = hours > 5 ? 50 : 0;
        return (baseRate * hours) + penalty;
    }
}
