package com.linkedlists.singly.inventorymanagementsystem;

public class InventoryManagementSystem {

    public static void main(String[] args) {

        InventoryLinkedList inventory = new InventoryLinkedList();

        inventory.addFirst(101, "Keyboard", 10, 800);
        inventory.addLast(102, "Mouse", 25, 400);
        inventory.addLast(103, "Monitor", 5, 12000);
        inventory.addFirst(104, "Laptop", 3, 55000);

        inventory.addAtPosition(2, 105, "Webcam", 7, 2500);

        System.out.println("All Inventory:");
        inventory.displayAll();

        System.out.println("Search by Item ID 102:");
        inventory.searchByItemId(102);

        System.out.println("Update Quantity (Monitor):");
        inventory.updateQuantity(103, 8);
        inventory.displayTotalInventoryValue();

        System.out.println("Sort by Name (ASC):");
        inventory.sortByName(true);
        inventory.displayAll();

        System.out.println("Sort by Price (DESC):");
        inventory.sortByPrice(false);
        inventory.displayAll();

        System.out.println("Remove Item ID 101:");
        inventory.removeByItemId(101);
        inventory.displayAll();
    }
}
