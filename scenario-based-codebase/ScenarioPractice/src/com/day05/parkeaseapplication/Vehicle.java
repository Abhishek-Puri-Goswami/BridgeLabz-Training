package com.day05.parkeaseapplication;

// Base class for vehicles
public abstract class Vehicle implements IPayable {

    protected String vehicleNumber;
    protected String type;

    // constructor
    public Vehicle(String vehicleNumber, String type) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
    }

    // getter for type of vehicle
    public String getType() {
        return type;
    }
}
