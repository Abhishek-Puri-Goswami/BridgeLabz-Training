package com.day01.vehiclerentalapplication;

public class Car extends Vehicle {

    public Car(String vehicleNumber) {
        super(vehicleNumber, 800);
    }

    @Override
    public double calculateRent(int days) {
        double insuranceCharge = 200;
        return (baseRate * days) + insuranceCharge;
    }

    @Override
    public void displayDetails() {
        System.out.println("Vehicle Type : Car");
        System.out.println("Vehicle No   : " + vehicleNumber);
    }
}
