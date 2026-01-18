/*
	 2. Bag-n-Ball Organizer
	 OOP Concepts:
	Classes, Objects, Inheritance (optional), Encapsulation, Method Design
	Scenario:
	You’re building a toy storage system for TinyTown Play School, which wants to keep track of
	bags and the balls inside them.
	Each Bag has:
	● A unique ID, color, and capacity (number of balls it can hold)
	Each Ball has:
	● A unique ID, color, and size (small/medium/large)
	
	 Problem Statement:
	Develop a Java system to:
	● Add balls to a bag (up to capacity)
	● Remove a ball from a bag
	● Display all balls in a bag
	● Display all bags and their ball count
	● Prevent adding a ball if the bag is full
	
	Encapsulate fields, use appropriate getters/setters, and model real-world object
	relations through composition (i.e., Bag "has-a" list of Balls)
	Bonus: Use an interface to define Storable behavior for both Bag and Ball.
*/

package com.day10.bagnballorganizerapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BagNBallOrganizerApp {

	private static List<Bag> bags = new ArrayList<>();
	private static List<Ball> balls = new ArrayList<>();

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("TinyTown Play School - Bag-n-Ball Organizer\n");

		int choice;
		do {
			printMenu();
			choice = input.nextInt();

			switch (choice) {
			case 1 -> createNewBag(input);
			case 2 -> createNewBall(input);
			case 3 -> addBallToBag(input);
			case 4 -> removeBallFromBag(input);
			case 5 -> displayBagContents(input);
			case 6 -> displayAllBags();
			case 7 -> System.out.println("Thank you for using the organizer!");
			default -> System.out.println("Invalid choice.");
			}
			System.out.println();
		} while (choice != 7);

		input.close();
	}

	// Prints menu options
	private static void printMenu() {
		System.out.println("1. Create new bag");
		System.out.println("2. Create new ball");
		System.out.println("3. Add ball to bag");
		System.out.println("4. Remove ball from bag");
		System.out.println("5. Display contents of a bag");
		System.out.println("6. Display all bags with ball counts");
		System.out.println("7. Exit");
		System.out.print("\nEnter choice: ");
	}

	// Creates a new bag
	private static void createNewBag(Scanner input) {
		System.out.print("Enter bag color: ");
		String color = input.next();
		System.out.print("Enter capacity: ");
		int capacity = input.nextInt();
		if (capacity <= 0) {
			System.out.println("Capacity must be positive.");
			return;
		}
		Bag bag = new Bag(color, capacity);
		bags.add(bag);
		System.out.println("Created: " + bag.getInfo());
	}

	// Creates a new ball with size validation
	private static void createNewBall(Scanner sc) {
		System.out.print("Enter ball color: ");
		String color = sc.next();
		System.out.print("Enter size (small/medium/large): ");
		String sizeInput = sc.next().toLowerCase();

		if (!(sizeInput.equals("small") || sizeInput.equals("medium") || sizeInput.equals("large"))) {
			System.out.println("Invalid size. Must be small, medium, or large.");
			return;
		}

		Ball ball = new Ball(color, sizeInput);
		balls.add(ball);
		System.out.println("Created: " + ball.getInfo());
	}

	// Adds a ball to a bag (checks capacity and existing placement)
	private static void addBallToBag(Scanner sc) {
		if (bags.isEmpty() || balls.isEmpty()) {
			System.out.println("Create bags and balls first.");
			return;
		}

		System.out.print("Enter ball ID: ");
		int ballId = sc.nextInt();
		Ball ball = findBall(ballId);
		if (ball == null) {
			System.out.println("Ball not found.");
			return;
		}

		System.out.print("Enter bag ID: ");
		int bagId = sc.nextInt();
		Bag bag = findBag(bagId);
		if (bag == null) {
			System.out.println("Bag not found.");
			return;
		}

		// Prevent adding ball already stored in any bag
		for (Bag b : bags) {
			if (b.containsBall(ball)) {
				System.out.println("Ball already in bag ID " + b.getId());
				return;
			}
		}

		if (bag.addBall(ball)) {
			System.out.println("Ball " + ballId + " added successfully.");
		} else {
			System.out.println("Bag is full.");
		}
	}

	// Removes a ball from a specific bag
	private static void removeBallFromBag(Scanner input) {
		System.out.print("Enter bag ID: ");
		int bagId = input.nextInt();
		Bag bag = findBag(bagId);
		if (bag == null) {
			System.out.println("Bag not found.");
			return;
		}

		System.out.print("Enter ball ID: ");
		int ballId = input.nextInt();
		if (bag.removeBallById(ballId)) {
			System.out.println("Ball removed.");
		} else {
			System.out.println("Ball not in this bag.");
		}
	}

	// Displays detailed contents of a bag
	private static void displayBagContents(Scanner input) {
		System.out.print("Enter bag ID: ");
		int bagId = input.nextInt();
		Bag bag = findBag(bagId);
		if (bag != null) {
			bag.displayContents();
		} else {
			System.out.println("Bag not found.");
		}
	}

	// Displays summary of all bags
	private static void displayAllBags() {
		if (bags.isEmpty()) {
			System.out.println("No bags created.");
		} else {
			System.out.println("\nAll bags:");
			for (Bag b : bags) {
				System.out.println(b.getInfo());
			}
		}
	}

	// Finds ball by Id
	private static Ball findBall(int id) {
		for (Ball b : balls) {
			if (b.getId() == id)
				return b;
		}
		return null;
	}

	// Finds bag by Id
	private static Bag findBag(int id) {
		for (Bag b : bags) {
			if (b.getId() == id)
				return b;
		}
		return null;
	}
}