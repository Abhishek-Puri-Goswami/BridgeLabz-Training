package com.day04.petpalapplication;

public class Cat extends Pet {

	// constructor
    public Cat(String name, int age) {
        super(name, "Cat", age);
    }

    @Override
    public void makeSound() {
        System.out.println("Cat says: Meow!");
    }
}
