package com.day04.petpalapplication;

public class Dog extends Pet {

	// constructor
    public Dog(String name, int age) {
        super(name, "Dog", age);
    }

    @Override
    public void makeSound() {
        System.out.println("Dog says: Woof Woof!");
    }
}
