package com.inheritance.hierarchical.animalhierarchy;

public class Bird extends Animal {

    // Constructor to initialize bird
    public Bird(String name, int age) {
        super(name, age);
    }

    // Overridden method with bird-specific behavior
    @Override
    public void makeSound() {
        System.out.println(name + " says: Chirp Chirp");
    }
}
