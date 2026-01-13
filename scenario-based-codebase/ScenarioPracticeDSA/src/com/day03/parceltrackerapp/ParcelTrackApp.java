/*
10. ParcelTracker – Delivery Chain Management (Singly Linked List)
Story: 
	● A courier company tracks parcels through stages like 
	  Packed → Shipped → In Transit → Delivered. 
	● Each stage is a node in a Singly Linked List.
Requirements:
	● Forward tracking through stages.
	● Add custom intermediate checkpoints.
	● Handle lost/missing parcels (null pointers).
*/

package com.day03.parceltrackerapp;

import java.util.Scanner;

public class ParcelTrackApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ParcelLinkedList parcel = new ParcelLinkedList();

        // Default delivery stages
        parcel.addStage("Packed");
        parcel.addStage("Shipped");
        parcel.addStage("In-Transit");
        parcel.addStage("Delivered");

        System.out.print("Do you want to add a custom checkpoint? (yes/no): ");
        String choice = input.nextLine();

        if (choice.equalsIgnoreCase("yes")) {
            System.out.print("Enter stage after which to add: ");
            String after = input.nextLine();

            System.out.print("Enter new checkpoint name: ");
            String newStage = input.nextLine();

            parcel.addAfter(after, newStage);
        }

        parcel.trackParcel();
        input.close();
    }
}
