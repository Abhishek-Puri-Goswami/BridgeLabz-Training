/*
12. "PetPal – Virtual Pet Care App"
Story: You’re creating PetPal, an app that allows users to adopt and care for virtual pets like
dogs, cats, and birds.
Requirements:
● Pet base class: name, type, age.
● Derived classes: Dog, Cat, Bird (use inheritance).
● IInteractable interface with methods like feed(), play(), sleep().
● Encapsulation of hunger and mood levels.
● Use constructors to assign random default values or user-specified pets.
● Operators to increase/decrease energy, hunger based on interactions.
● Polymorphism: makeSound() behaves differently for each pet.
● Access modifiers ensure internal mood status is only modifiable through methods.
*/

package com.day04.petpalapplication;

import java.util.Scanner;

public class PetPalApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Pet Name: ");
        String name = input.nextLine();

        System.out.print("Enter Pet Age: ");
        int age = input.nextInt();

        System.out.println("Select Pet Type:");
        System.out.println("1. Dog");
        System.out.println("2. Cat");
        System.out.println("3. Bird");
        System.out.print("Choice: ");
        int choice = input.nextInt();

        Pet pet;
        if (choice == 1) {
            pet = new Dog(name, age);
        } else if (choice == 2) {
            pet = new Cat(name, age);
        } else {
            pet = new Bird(name, age);
        }

        System.out.println("\n--- Initial Pet Status ---");
        System.out.printf("%-10s %-10s %-5s %-8s %-8s %-10s%n",
                "Name", "Type", "Age", "Hunger", "Energy", "Mood");
        pet.printStatus();

        // Interaction menu
        System.out.println("\nChoose Interaction:");
        System.out.println("1. Feed");
        System.out.println("2. Play");
        System.out.println("3. Sleep");
        System.out.print("Choice: ");
        int action = input.nextInt();

        if (action == 1) {
            pet.feed();
        } else if (action == 2) {
            pet.play();
        } else {
            pet.sleep();
        }

        pet.makeSound();

        System.out.println("\n--- Updated Pet Status ---");
        System.out.printf("%-10s %-10s %-5s %-8s %-8s %-10s%n",
                "Name", "Type", "Age", "Hunger", "Energy", "Mood");
        pet.printStatus();

        input.close();
    }
}
