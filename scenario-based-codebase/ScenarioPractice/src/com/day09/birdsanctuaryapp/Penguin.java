package com.day09.birdsanctuaryapp;

public class Penguin extends Bird implements Swimmable {

    public Penguin(int id, String name) {
        super(id, name, "Penguin");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating fish underwater.");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " is diving and swimming like a torpedo!");
    }
}