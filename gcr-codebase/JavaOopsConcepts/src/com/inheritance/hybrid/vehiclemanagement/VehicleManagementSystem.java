package com.inheritance.hybrid.vehiclemanagement;

public class VehicleManagementSystem {

    public static void main(String[] args) {

        // Hybrid inheritance demonstration
        Vehicle ev = new ElectricVehicle("Tesla Model 3", 220, 75);
        Vehicle pv = new PetrolVehicle("Honda City", 180, 40);

        ev.displayInfo();
        ((ElectricVehicle) ev).charge();
        System.out.println("---------------------");

        pv.displayInfo();
        ((PetrolVehicle) pv).refuel();
    }
}
