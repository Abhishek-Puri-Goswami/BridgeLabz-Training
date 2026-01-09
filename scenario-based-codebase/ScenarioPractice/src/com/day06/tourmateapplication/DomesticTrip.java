package com.day06.tourmateapplication;

public class DomesticTrip extends Trip {

    public DomesticTrip(String destination, int duration,
                        Transport transport, Hotel hotel, Activity activity) {
        super(destination, duration, transport, hotel, activity);
    }

    @Override
    public void book() {
        System.out.println("Domestic trip booked with standard services.");
    }

    @Override
    public void cancel() {
        System.out.println("Domestic trip cancelled.");
    }
}
