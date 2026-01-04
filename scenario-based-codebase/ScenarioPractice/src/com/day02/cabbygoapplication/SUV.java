package com.day02.cabbygoapplication;

public class SUV extends Vehicle {

    private final double BASE_FARE = 120;
    private final double RATE_PER_KM = 20;

    // constructor
    public SUV(String vehicleNumber) {
        super(vehicleNumber, 6, "SUV");
    }

    // method to book a suv ride
    @Override
    public void bookRide(int distance) {
        double totalFare = BASE_FARE + (distance * RATE_PER_KM);
        setFare(totalFare);
        System.out.println("SUV Ride Booked");
        System.out.println("Distance : " + distance + " km");
        System.out.println("Fare     : Rs." + totalFare);
    }

    // method to stop ride
    @Override
    public void endRide() {
        System.out.println("SUV Ride Ended");
    }
}
