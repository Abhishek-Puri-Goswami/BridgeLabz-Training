package com.day02.cabbygoapplication;

public class Sedan extends Vehicle {

    private final double BASE_FARE = 80;
    private final double RATE_PER_KM = 15;

    // constructor
    public Sedan(String vehicleNumber) {
        super(vehicleNumber, 4, "Sedan");
    }

    // method to book a sedan ride
    @Override
    public void bookRide(int distance) {
        double totalFare = BASE_FARE + (distance * RATE_PER_KM);
        setFare(totalFare);
        System.out.println("Sedan Ride Booked");
        System.out.println("Distance : " + distance + " km");
        System.out.println("Fare     : Rs." + totalFare);
    }

    // method to stop ride
    @Override
    public void endRide() {
        System.out.println("Sedan Ride Ended");
    }
}
