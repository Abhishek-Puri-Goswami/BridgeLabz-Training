package com.day06.tourmateapplication;

public class InternationalTrip extends Trip {

    public InternationalTrip(String destination, int duration,
                             Transport transport, Hotel hotel, Activity activity) {
        super(destination, duration, transport, hotel, activity);
    }

    @Override
    public void book() {
        System.out.println("International trip booked with visa and insurance.");
    }

    @Override
    public void cancel() {
        System.out.println("International trip cancelled.");
    }
}
