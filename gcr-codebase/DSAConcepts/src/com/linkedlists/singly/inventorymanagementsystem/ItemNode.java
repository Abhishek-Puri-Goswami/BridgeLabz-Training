package com.linkedlists.singly.inventorymanagementsystem;

public class ItemNode {

    int itemId;
    String itemName;
    int quantity;
    double price;

    ItemNode next;

    // Constructor
    ItemNode(int itemId, String itemName, int quantity, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}
