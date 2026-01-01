package com.encapsulation.vehiclerentalsystem;

public class Truck extends Vehicle implements Insurable {

    private String insurancePolicyNumber;

    // Constructor to initialize truck
    public Truck(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = policyNumber;
    }

    // Rental cost calculation for truck
    @Override
    public double calculateRentalCost(int days) {
        return (getRentalRate() * days) + 200; // extra handling charge
    }

    // Insurance calculation for truck
    @Override
    public double calculateInsurance() {
        return 1200; // higher insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance (Policy Hidden)";
    }
}
