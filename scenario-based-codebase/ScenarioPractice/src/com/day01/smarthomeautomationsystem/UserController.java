package com.day01.smarthomeautomationsystem;

public class UserController {

    public static void main(String[] args) {

        Appliance light = new Light();
        Appliance fan = new Fan();
        Appliance ac = new AC();

        light.turnOn();
        fan.turnOn();
        ac.turnOn();

        System.out.println();

        light.showStatus();
        fan.showStatus();
        ac.showStatus();

        System.out.println("\nPower Usage Comparison:");

        if (ac.getPowerUsage() > fan.getPowerUsage()) {
            System.out.println("AC consumes more power than Fan");
        }

        if (fan.getPowerUsage() > light.getPowerUsage()) {
            System.out.println("Fan consumes more power than Light");
        }

        ac.turnOff();
        ac.showStatus();
    }
}
