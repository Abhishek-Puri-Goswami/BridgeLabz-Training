package com.day05.parkeaseapplication;

// Truck-specific charge calculation
public class Truck extends Vehicle {

	// constructor
    public Truck(String vehicleNumber) {
        super(vehicleNumber, "Truck");
    }

    // method to calculate total charges
    @Override
    public double calculateCharges(int hours) {
        double baseRate = 100;
        double penalty = hours > 5 ? 200 : 0;
        return (baseRate * hours) + penalty;
    }
}
