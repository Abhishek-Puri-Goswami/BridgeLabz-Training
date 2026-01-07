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
