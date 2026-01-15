/*
Bird Sanctuary – Java OOP Scenario

Goal: 
	● Design and implement a Bird Sanctuary system to manage different types of birds, utilizing Inheritance and Polymorphism.

Scenario (Story-Based):
	● You are hired by the EcoWing Wildlife Conservation Center, which runs a Bird Sanctuary to protect and study various birds. 
	● They want to digitize their tracking and behavior management system.

The sanctuary houses a variety of birds, each with different abilities:
	● Some can fly (e.g., Eagle, Sparrow)
	● Some can swim (e.g., Duck, Penguin)
	● Some can both fly and swim (e.g., Seagull)
	● Some can neither (e.g., Kiwi, Ostrich)

Each bird has:
	● A name
	● A species
	● A unique ID
	● Behaviors like eat(), and if applicable, fly(), swim()

Requirements / Problem Statement:
	Design a Java application that fulfills the following:
	1. Use Inheritance:
		● Create a base class Bird with common properties and methods (name, id, species, eat()).
		● Derive classes like Eagle, Duck, Penguin, etc., extending the Bird class.
		● Create interfaces: Flyable, Swimmable – with abstract methods fly() and swim() respectively.
		● Implement these interfaces in relevant bird classes.
	
	2. Use Polymorphism:
		● Maintain a list of all birds in the sanctuary.
		● Use a loop to call fly() or swim() polymorphically only for birds that implement those behaviors.
	
	3. Functionality to Implement:
		●  Add new birds to the sanctuary
		●  Search birds by flying/swimming ability
		●   Display all birds with their full information and abilities
		● ️ Remove a bird by ID
		●  Show a report that counts how many birds are Flyable, Swimmable, Both, or Neither
	
Technical Constraints:
	● Use Java Inheritance and Interfaces
	● Use Polymorphism for invoking fly/swim/eat methods
	● Use ArrayList<Bird> or Map<String, Bird> to store bird records
	● Follow good OOP practices: encapsulation, clean code, modular design Stretch Goals (Optional):
	● Save and load bird data from a file (using serialization)
	● Add age, health status, or feeding schedule
	● Track last feeding time or behavior logs
	                         
Example Output (CLI):
	Welcome to EcoWing Bird Sanctuary
	1. Add Bird
	2. Display All Birds
	3. Display All Flying Birds
	4. Display All Swimming Birds
	5. Display Both Flying & Swimming Birds
	6. Delete Bird by ID
	7. Sanctuary Report
	8. Exit
*/

package com.day09.birdsanctuaryapp;

import java.util.Scanner;

public class EcoWingSanctuaryApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BirdSanctuary sanctuary = new BirdSanctuary();

		// Added some birds
		sanctuary.addBird(new Eagle(1001, "Eagle-Sam"));
		sanctuary.addBird(new Duck(1002, "Duck-Daffy"));
		sanctuary.addBird(new Penguin(1003, "Penguin-Puddles"));
		sanctuary.addBird(new Seagull(1004, "Seagull-Sammy"));
		sanctuary.addBird(new Kiwi(1005, "Kiwi-Kiki"));
		sanctuary.addBird(new Ostrich(1006, "Ostrich-Ozzy"));

		System.out.println("Welcome to EcoWing Bird Sanctuary\n");

		while (true) {
			System.out.println("1. Add Bird");
			System.out.println("2. Display All Birds");
			System.out.println("3. Display All Flying Birds");
			System.out.println("4. Display All Swimming Birds");
			System.out.println("5. Display Both Flying & Swimming Birds");
			System.out.println("6. Delete Bird by ID");
			System.out.println("7. Sanctuary Report");
			System.out.println("8. Simulate Flight Session");
			System.out.println("9. Exit");
			System.out.print("\nChoose option: ");

			int choice = input.nextInt();
			input.nextLine();

			if (choice == 9) {
				System.out.println("Goodbye! Thank you for helping EcoWing.");
				break;
			}

			switch (choice) {
			case 1 -> {
				System.out.print("Enter bird type (Eagle, Duck, Penguin, Seagull, Kiwi, Ostrich): ");
				String type = input.nextLine().trim();

				System.out.print("Enter name: ");
				String name = input.nextLine().trim();

				Bird bird = switch (type.toLowerCase()) {
				case "eagle" -> new Eagle(sanctuary.getNextId(), name);
				case "duck" -> new Duck(sanctuary.getNextId(), name);
				case "penguin" -> new Penguin(sanctuary.getNextId(), name);
				case "seagull" -> new Seagull(sanctuary.getNextId(), name);
				case "kiwi" -> new Kiwi(sanctuary.getNextId(), name);
				case "ostrich" -> new Ostrich(sanctuary.getNextId(), name);
				default -> {
					System.out.println("Unknown bird type.");
					yield null;
				}
				};

				if (bird != null) {
					sanctuary.addBird(bird);
				}
			}

			case 2 -> sanctuary.displayAllBirds();
			case 3 -> sanctuary.displayFlyingBirds();
			case 4 -> sanctuary.displaySwimmingBirds();
			case 5 -> sanctuary.displayBothAbilitiesBirds();

			case 6 -> {
				System.out.print("Enter bird ID to remove: ");
				int id = input.nextInt();
				sanctuary.removeBirdById(id);
			}

			case 7 -> sanctuary.generateReport();
			case 8 -> sanctuary.simulateFlightSession();

			default -> System.out.println("Invalid choice. Try again.");
			}
		}
		input.close();
	}
}