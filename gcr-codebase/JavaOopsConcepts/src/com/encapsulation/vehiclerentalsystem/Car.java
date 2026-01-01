package com.encapsulation.vehiclerentalsystem;

public class Car extends Vehicle implements Insurable {

    private String insurancePolicyNumber;

    // Constructor to initialize car
    public Car(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = policyNumber;
    }

    // Rental cost calculation for car
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    // Insurance calculation for car
    @Override
    public double calculateInsurance() {
        return 500; // fixed insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance (Policy Hidden)";
    }
}
