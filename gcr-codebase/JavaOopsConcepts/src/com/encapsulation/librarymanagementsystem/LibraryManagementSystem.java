package com.encapsulation.librarymanagementsystem;

import java.util.ArrayList;

public class LibraryManagementSystem {

    public static void main(String[] args) {

        ArrayList<LibraryItem> items = new ArrayList<>();

        LibraryItem item1 = new Book(1, "Effective Java", "Joshua Bloch");
        LibraryItem item2 = new Magazine(2, "Tech Today", "Editorial Team");
        LibraryItem item3 = new DVD(3, "Inception", "Christopher Nolan");

        items.add(item1);
        items.add(item2);
        items.add(item3);

        // Polymorphism: managing all items using LibraryItem reference
        for (LibraryItem item : items) {

            item.getItemDetails();

            if (item instanceof Reservable) {
                Reservable reservable = (Reservable) item;
                System.out.println("Available : " + reservable.checkAvailability());
                reservable.reserveItem("User-Private");
                System.out.println("Available After Reservation : " +
                        reservable.checkAvailability());
            }

            System.out.println("----------------------------");
        }
    }
}
