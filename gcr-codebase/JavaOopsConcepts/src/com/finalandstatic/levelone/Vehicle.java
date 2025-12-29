package com.finalandstatic.levelone;

public class Vehicle {
    // Attributes
    private static int registrationFee = 3500;
    private String ownerName;
    private String vehicleType;
    private final int registrationNumber;
    // Contructor
    public Vehicle(String ownerName, String vehicleType, int registrationNumber) {
        // Resolving ambiguity using this keyword
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }
    // Method to update registration fee
    public static void updateRegistrationFee(int newRegistrationFee) {
        registrationFee = newRegistrationFee;
    }
    // Method to display details
    public void displayDetails() {
        if(this instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        } else {
            System.out.println("Invalid vehicle object.");
        }
    }
    // Main method
    public static void main(String[] args) {
        // Create Vehicle objects
        Vehicle car = new Vehicle("Adarsh Patel", "Car", 4465166);
        Vehicle bike = new Vehicle("Raj Kumar", "bike", 545161);
        // Display details
        car.displayDetails();
        bike.displayDetails();
        // Update registration fee
        Vehicle.updateRegistrationFee(4500);
        System.out.println("\nUpdated registration fee: " + registrationFee);
        // Display details after updating registration fee
        car.displayDetails();
        bike.displayDetails();
    }
}