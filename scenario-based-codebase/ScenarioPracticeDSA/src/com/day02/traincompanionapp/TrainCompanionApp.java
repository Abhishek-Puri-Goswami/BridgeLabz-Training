/*
5. TrainCompanion – Compartment Navigation System (Doubly Linked List)
Story: 
	● In a long-distance train app, passengers can walk to the next or previous compartment, or search for services (like pantry, WiFi). 
	● Each compartment is a node in a Doubly Linked List.
Requirements:
	● Traverse forward or backward.
	● Insert/Remove compartments dynamically.
	● Display adjacent compartments for quick decisions. 
*/

package com.day02.traincompanionapp;

public class TrainCompanionApp {
	public static void main(String[] args) {
		TrainCoach train = new TrainCoach();

		// Initial train composition
		train.addCompartment("Power", "Engine car");
		train.addCompartment("S1", "Sleeper coach");
		train.addCompartment("S2", "Sleeper coach");
		train.addCompartment("Pantry", "Food & catering");
		train.addCompartment("B1", "AC 3-tier");
		train.addCompartment("A1", "AC 2-tier");
		train.addCompartment("HA1", "First AC");
		train.addCompartment("Guard", "Guard cabin");

		System.out.println("Initial Train Composition:");
		train.printTrain();
		System.out.println();

		// Passenger starts from S1
		Compartment current = TrainCoach.findCompartment(train, "S1");
		System.out.println("Passenger's Current Position:- ");
		train.showNearby(current);

		// Move forward
		current = train.moveForward(current);
		System.out.println("Moved forward:-");
		train.showNearby(current);

		// Move forward
		current = train.moveBackward(current);
		System.out.println("Moved backward:-");
		train.showNearby(current);

		// Find nearest pantry
		Compartment pantry = train.findNearestService(current, "Pantry");
		if (pantry != null) {
			System.out.println("Nearest Pantry is: " + pantry.getInfo());
		}

		// Emergency coach added
		System.out.println("\nEmergency: Adding extra coach after S2");
		train.insertAfter("S2", "E1", "Extra Sleeper (special)");

		train.printTrain();
		
		current = train.moveForward(current);
		train.showNearby(current);

		// Remove Pantry for cleaning
		System.out.println("Pantry closed for cleaning...");
		boolean removed = train.removeCompartment("Pantry");
		System.out.println(removed ? "Pantry removed successfully." : "Pantry not found.");

		System.out.println("\nCurrent Train Composition:");
		train.printTrain();
	}
}