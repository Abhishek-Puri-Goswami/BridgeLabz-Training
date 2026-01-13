package com.day03.parceltrackerapp;

public class ParcelLinkedList {

	private ParcelNode head;

	// Adds custom stage at end
	public void addStage(String stage) {
		ParcelNode newNode = new ParcelNode(stage);

		if (head == null) {
			head = newNode;
			return;
		}

		ParcelNode temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}

	// Inserts checkpoint after a given stage
	public void addAfter(String afterStage, String newStage) {

		ParcelNode temp = head;
		while (temp != null && !temp.stage.equalsIgnoreCase(afterStage)) {
			temp = temp.next;
		}

		if (temp != null) {
			ParcelNode newNode = new ParcelNode(newStage);
			newNode.next = temp.next;
			temp.next = newNode;
		} else {
			System.out.println("Stage not found. Cannot add checkpoint.");
		}
	}

	// Forward traversal with null handling
	public void trackParcel() {
		if (head == null) {
			System.out.println("Parcel tracking lost. No data available.");
			return;
		}

		System.out.println("\n--- Parcel Tracking ---");

		ParcelNode temp = head;
		int step = 1;

		while (temp != null) {
			System.out.printf("Step %-2d : %s%n", step++, temp.stage);
			temp = temp.next;
		}
	}
}
