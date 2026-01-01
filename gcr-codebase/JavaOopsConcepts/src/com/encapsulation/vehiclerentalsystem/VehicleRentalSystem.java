package com.encapsulation.vehiclerentalsystem;

import java.util.ArrayList;

public class VehicleRentalSystem {

    public static void main(String[] args) {

        ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("CAR-101", 1500, "CAR-INS-9001"));
        vehicles.add(new Bike("BIKE-202", 500));
        vehicles.add(new Truck("TRUCK-303", 3000, "TRUCK-INS-7788"));

        int rentalDays = 3;

        // Polymorphism: processing vehicles using Vehicle reference
        for (Vehicle vehicle : vehicles) {

            vehicle.displayDetails();

            double rentalCost = vehicle.calculateRentalCost(rentalDays);
            System.out.println("Rental Cost (" + rentalDays + " days): " + rentalCost);

            if (vehicle instanceof Insurable) {
                Insurable insurable = (Insurable) vehicle;
                System.out.println("Insurance Cost : " + insurable.calculateInsurance());
                System.out.println("Insurance Info : " + insurable.getInsuranceDetails());
            }

            System.out.println("----------------------------");
        }
    }
}
