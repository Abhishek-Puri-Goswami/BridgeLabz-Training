package com.day06.tourmateapplication;

public abstract class Trip implements IBookable {

    protected String destination;
    protected int duration;
    protected double budget;

    protected Transport transport;
    protected Hotel hotel;
    protected Activity activity;

    // Constructor to create complete trip package
    public Trip(String destination, int duration,
                Transport transport, Hotel hotel, Activity activity) {

        this.destination = destination;
        this.duration = duration;
        this.transport = transport;
        this.hotel = hotel;
        this.activity = activity;

        // Total budget calculation
        this.budget = transport.getCost() + hotel.getCost() + activity.getCost();
    }

    public void printTrip() {
        System.out.printf("%-15s %-10d Rs.%-12.2f%n",
                destination, duration, budget);
    }
}
