package com.day01.smarthomeautomationsystem;

public class AC extends Appliance {

    public AC() {
        super(1500);
    }

    @Override
    public void turnOn() {
        setPowerStatus(true);
        System.out.println("AC is cooling the room");
    }

    @Override
    public void turnOff() {
        setPowerStatus(false);
        System.out.println("AC is turned OFF");
    }

    @Override
    public void showStatus() {
        System.out.println("AC Status : " + (isOn() ? "ON" : "OFF"));
    }
}
