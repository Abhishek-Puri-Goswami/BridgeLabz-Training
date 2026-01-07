package com.day05.parkeaseapplication;

// Car-specific charge calculation
public class Car extends Vehicle {

	// constructor
    public Car(String vehicleNumber) {
        super(vehicleNumber, "Car");
    }

    // method to calculate total charges
    @Override
    public double calculateCharges(int hours) {
        double baseRate = 50;
        double penalty = hours > 5 ? 100 : 0;
        return (baseRate * hours) + penalty;
    }
}
