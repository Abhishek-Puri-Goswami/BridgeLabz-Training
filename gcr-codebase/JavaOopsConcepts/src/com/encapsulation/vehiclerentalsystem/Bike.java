package com.encapsulation.vehiclerentalsystem;

public class Bike extends Vehicle {

    // Constructor to initialize bike
    public Bike(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Bike", rentalRate);
    }

    // Rental cost calculation for bike
    @Override
    public double calculateRentalCost(int days) {
        return (getRentalRate() * days) * 0.9; // discount for bikes
    }
}
