/*
16. "ParkEase – Smart Parking Management System"
Story: A city wants a smart parking solution that can assign parking slots, calculate charges,
and track availability in real time.
Requirements:
● ParkingSlot class: slotId, isOccupied, vehicleTypeAllowed.
● Vehicle base class → Car, Bike, Truck subclasses.
● IPayable interface with calculateCharges(duration) method.
● Encapsulation: Slot availability shouldn't be altered externally.
● Use constructors for slot initialization with location, vehicle type.
● Operators: (baseRate × hours) + (penalty if over time).
● Polymorphism: calculateCharges() differs by vehicle type.
● Access Modifiers: internal booking records are private, exposed via logs.
*/

package com.day05.parkeaseapplication;

import java.util.Scanner;

public class ParkEaseApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ParkingManager manager = new ParkingManager();

        ParkingSlot slot = new ParkingSlot(101, "Zone-A", "Car");

        System.out.println("\n--- Available Parking Slot ---");
        System.out.printf("%-8s %-10s %-10s %-10s%n",
                "SlotID", "Location", "Allowed", "Status");
        slot.printSlot();

        System.out.print("\nEnter Vehicle Number: ");
        String number = input.nextLine();

        System.out.println("Select Vehicle Type:");
        System.out.println("1. Car");
        System.out.println("2. Bike");
        System.out.println("3. Truck");
        System.out.print("Choice: ");
        int choice = input.nextInt();

        Vehicle vehicle;
        if (choice == 1) {
            vehicle = new Car(number);
        } else if (choice == 2) {
            vehicle = new Bike(number);
        } else {
            vehicle = new Truck(number);
        }

        if (slot.canPark(vehicle.getType())) {
            slot.occupySlot();

            System.out.print("Enter parking duration (hours): ");
            int hours = input.nextInt();

            double charges = vehicle.calculateCharges(hours);
            manager.logBooking("Vehicle " + number + " parked for " + hours +
                    " hrs | Charges: Rs." + charges);

            System.out.println("\n--- Parking Bill ---");
            System.out.printf("%-20s : %s%n", "Vehicle Type", vehicle.getType());
            System.out.printf("%-20s : %d%n", "Duration (hrs)", hours);
            System.out.printf("%-20s : Rs.%.2f%n", "Total Charges", charges);

            slot.freeSlot();
        } else {
            System.out.println("Parking not allowed for this vehicle type.");
        }

        manager.showLogs();
        input.close();
    }
}
