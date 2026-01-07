package com.day04.petpalapplication;

import java.util.Random;

public abstract class Pet implements IInteractable {

    protected String name;
    protected String type;
    protected int age;

    private int hunger;
    private int energy;
    private String mood;

    // Constructor with random initial values
    public Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;

        Random random = new Random();
        this.hunger = random.nextInt(50) + 30;
        this.energy = random.nextInt(50) + 30;
        updateMood();
    }

    // Constructor with user-defined values
    public Pet(String name, String type, int age, int hunger, int energy) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.hunger = hunger;
        this.energy = energy;
        updateMood();
    }

    // Updates mood based on hunger and energy
    protected void updateMood() {
        if (hunger < 40 && energy > 60) {
            mood = "Happy";
        } else if (hunger > 70) {
            mood = "Hungry";
        } else if (energy < 30) {
            mood = "Tired";
        } else {
            mood = "Normal";
        }
    }

    // Displays pet status in tabular format
    public void printStatus() {
        System.out.printf("%-10s %-10s %-5d %-8d %-8d %-10s%n",
                name, type, age, hunger, energy, mood);
    }

    @Override
    public void feed() {
        hunger -= 20;
        if (hunger < 0) hunger = 0;
        updateMood();
    }

    @Override
    public void play() {
        energy -= 20;
        hunger += 10;
        updateMood();
    }

    @Override
    public void sleep() {
        energy += 30;
        if (energy > 100) energy = 100;
        updateMood();
    }

    public abstract void makeSound();
}
