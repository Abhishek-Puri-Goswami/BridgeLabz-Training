package com.day02.cabbygoapplication;

public abstract class Vehicle implements IRideService {

    protected String vehicleNumber;
    protected int capacity;
    protected String type;

    private double fare;

    // constructor
    public Vehicle(String vehicleNumber, int capacity, String type) {
        this.vehicleNumber = vehicleNumber;
        this.capacity = capacity;
        this.type = type;
    }

    // getter for fare
    public double getFare() {
        return fare;
    }
    
    // setter for fare
    protected void setFare(double fare) {
    	this.fare = fare;
    }

    // display a vehicle
    public void displayVehicle() {
        System.out.println("Vehicle Type   : " + type);
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Capacity       : " + capacity);
    }
}
