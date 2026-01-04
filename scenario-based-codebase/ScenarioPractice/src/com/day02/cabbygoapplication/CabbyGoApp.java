package com.day02.cabbygoapplication;

import java.util.Scanner;

public class CabbyGoApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // input
        System.out.print("Enter driver name: ");
        String driverName = input.nextLine();

        System.out.print("Enter license number: ");
        String license = input.nextLine();

        System.out.print("Enter driver rating: ");
        double rating = input.nextDouble();

        Driver driver = new Driver(driverName, license, rating);

        System.out.println("\nSelect Vehicle Type:");
        System.out.println("1. Mini");
        System.out.println("2. Sedan");
        System.out.println("3. SUV");
        System.out.print("Enter choice: ");
        int choice = input.nextInt();

        System.out.print("Enter vehicle number: ");
        input.nextLine();
        String vehicleNumber = input.nextLine();

        Vehicle vehicle;

        if (choice == 1) {
            vehicle = new Mini(vehicleNumber);
        } else if (choice == 2) {
            vehicle = new Sedan(vehicleNumber);
        } else {
            vehicle = new SUV(vehicleNumber);
        }

        System.out.print("Enter distance (in km): ");
        int distance = input.nextInt();

        System.out.println("---- Driver Details ----");
        driver.displayDriver();

        System.out.println("---- Vehicle Details ----");
        vehicle.displayVehicle();

        System.out.println("---- Ride Details ----");
        vehicle.bookRide(distance);
        vehicle.endRide();

        input.close();
    }
}
