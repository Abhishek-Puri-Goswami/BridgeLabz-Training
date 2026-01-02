package com.day01.vehiclerentalapplication;

public class Truck extends Vehicle {

    public Truck(String vehicleNumber) {
        super(vehicleNumber, 1500);
    }

    @Override
    public double calculateRent(int days) {
        double loadingCharge = 500;
        return (baseRate * days) + loadingCharge;
    }

    @Override
    public void displayDetails() {
        System.out.println("Vehicle Type : Truck");
        System.out.println("Vehicle No   : " + vehicleNumber);
    }
}
