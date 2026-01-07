package com.day04.petpalapplication;

public class Bird extends Pet {

	// constructor
    public Bird(String name, int age) {
        super(name, "Bird", age);
    }

    @Override
    public void makeSound() {
        System.out.println("Bird says: Chirp Chirp!");
    }
}
