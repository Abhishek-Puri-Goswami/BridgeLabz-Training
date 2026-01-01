package com.encapsulation.ridehailingapplication;

import java.util.ArrayList;

public class RideHailingApplication {

    public static void main(String[] args) {

        ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("CAR-101", "Ashish", 15));
        vehicles.add(new Bike("BIKE-202", "Divyansh", 10));
        vehicles.add(new Auto("AUTO-303", "Akshat", 12));

        double distance = 8.5;

        // Polymorphism: calculating fare dynamically
        for (Vehicle vehicle : vehicles) {

            vehicle.getVehicleDetails();
            System.out.println("Distance  : " + distance + " km");
            System.out.println("Fare      : " + vehicle.calculateFare(distance));

            if (vehicle instanceof GPS) {
                GPS gps = (GPS) vehicle;
                gps.updateLocation("City Center");
                System.out.println("Location  : " + gps.getCurrentLocation());
            }

            System.out.println("----------------------------");
        }
    }
}
