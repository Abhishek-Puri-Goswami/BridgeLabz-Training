package com.day02.cabbygoapplication;

public class Mini extends Vehicle {

    private final double BASE_FARE = 50;
    private final double RATE_PER_KM = 10;

    // constructor
    public Mini(String vehicleNumber) {
        super(vehicleNumber, 4, "Mini");
    }

    // method to book a mini ride
    @Override
    public void bookRide(int distance) {
        double totalFare = BASE_FARE + (distance * RATE_PER_KM);
        setFare(totalFare);
        System.out.println("Mini Ride Booked");
        System.out.println("Distance : " + distance + " km");
        System.out.println("Fare     : Rs." + totalFare);
    }

    // method to stop ride
    @Override
    public void endRide() {
        System.out.println("Mini Ride Ended");
    }
}
