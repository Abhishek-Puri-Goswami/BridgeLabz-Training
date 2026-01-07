package com.day05.parkeaseapplication;

import java.util.ArrayList;

// Manages parking slots and booking logs
public class ParkingManager {

    private ArrayList<String> bookingLogs;

    // constructor
    public ParkingManager() {
        bookingLogs = new ArrayList<>();
    }

    // Records booking 
    public void logBooking(String log) {
        bookingLogs.add(log);
    }

    public void showLogs() {
        System.out.println("\n--- Booking Logs ---");
        for (String log : bookingLogs) {
            System.out.println(log);
        }
    }
}
