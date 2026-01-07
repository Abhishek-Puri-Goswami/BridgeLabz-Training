package com.day05.parkeaseapplication;

// Represents a parking slot
public class ParkingSlot {

    private int slotId;
    private boolean isOccupied;
    private String vehicleTypeAllowed;
    private String location;

    // constructor
    public ParkingSlot(int slotId, String location, String vehicleTypeAllowed) {
        this.slotId = slotId;
        this.location = location;
        this.vehicleTypeAllowed = vehicleTypeAllowed;
        this.isOccupied = false;
    }

    // method to check if slot is free
    public boolean canPark(String vehicleType) {
        return !isOccupied && vehicleTypeAllowed.equalsIgnoreCase(vehicleType);
    }

    // method to occupy parking slot
    public void occupySlot() {
        isOccupied = true;
    }

    // method to free parking slot
    public void freeSlot() {
        isOccupied = false;
    }

    // method to print slot details
    public void printSlot() {
        System.out.printf("%-8d %-10s %-10s %-10s%n",
                slotId, location, vehicleTypeAllowed,
                isOccupied ? "Occupied" : "Free");
    }
}
