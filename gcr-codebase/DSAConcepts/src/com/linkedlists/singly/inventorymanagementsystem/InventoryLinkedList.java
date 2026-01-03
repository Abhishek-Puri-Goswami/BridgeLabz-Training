package com.linkedlists.singly.inventorymanagementsystem;

public class InventoryLinkedList {

    private ItemNode head;

    // Add at start
    public void addFirst(int id, String name, int qty, double price) {
        ItemNode node = new ItemNode(id, name, qty, price);
        node.next = head;
        head = node;
    }

    // Add at end
    public void addLast(int id, String name, int qty, double price) {
        ItemNode node = new ItemNode(id, name, qty, price);

        if (head == null) {
            head = node;
            return;
        }

        ItemNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    // Add at specific position (0-based)
    public void addAtPosition(int index, int id, String name, int qty, double price) {

        if (index < 0) {
            System.out.println("Invalid index.");
            return;
        }

        if (index == 0) {
            addFirst(id, name, qty, price);
            return;
        }

        ItemNode temp = head;
        for (int i = 0; temp != null && i < index - 1; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Index out of bounds.");
            return;
        }

        ItemNode node = new ItemNode(id, name, qty, price);
        node.next = temp.next;
        temp.next = node;
    }

    // Remove item by ID
    public void removeByItemId(int id) {

        if (head == null) {
            System.out.println("Inventory empty.");
            return;
        }

        if (head.itemId == id) {
            head = head.next;
            return;
        }

        ItemNode temp = head;
        while (temp.next != null && temp.next.itemId != id) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Item not found.");
            return;
        }

        temp.next = temp.next.next;
    }

    // Update quantity by item ID
    public void updateQuantity(int id, int newQty) {

        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                temp.quantity = newQty;
                System.out.println("Quantity updated.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found.");
    }

    public void searchByItemId(int id) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                displayItem(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found.");
    }

    public void searchByItemName(String name) {
        ItemNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(name)) {
                displayItem(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("Item not found.");
        }
    }

    public void displayTotalInventoryValue() {
        double total = 0;
        ItemNode temp = head;

        while (temp != null) {
            total += temp.price * temp.quantity;
            temp = temp.next;
        }

        System.out.println("Total Inventory Value: " + total);
    }

    // merge sort
    public void sortByName(boolean ascending) {
        head = mergeSort(head, true, ascending);
    }

    public void sortByPrice(boolean ascending) {
        head = mergeSort(head, false, ascending);
    }

    private ItemNode mergeSort(ItemNode node, boolean byName, boolean asc) {

        if (node == null || node.next == null) {
            return node;
        }

        ItemNode middle = getMiddle(node);
        ItemNode nextOfMiddle = middle.next;
        middle.next = null;

        ItemNode left = mergeSort(node, byName, asc);
        ItemNode right = mergeSort(nextOfMiddle, byName, asc);

        return merge(left, right, byName, asc);
    }

    private ItemNode merge(ItemNode a, ItemNode b, boolean byName, boolean asc) {

        if (a == null) return b;
        if (b == null) return a;

        boolean condition;

        if (byName) {
            condition = asc
                    ? a.itemName.compareToIgnoreCase(b.itemName) <= 0
                    : a.itemName.compareToIgnoreCase(b.itemName) > 0;
        } else {
            condition = asc ? a.price <= b.price : a.price > b.price;
        }

        ItemNode result;
        if (condition) {
            result = a;
            result.next = merge(a.next, b, byName, asc);
        } else {
            result = b;
            result.next = merge(a, b.next, byName, asc);
        }
        return result;
    }

    private ItemNode getMiddle(ItemNode node) {

        if (node == null) return node;

        ItemNode slow = node;
        ItemNode fast = node.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // method to display items
    public void displayAll() {

        if (head == null) {
            System.out.println("Inventory empty.");
            return;
        }

        ItemNode temp = head;
        int index = 0;

        while (temp != null) {
            System.out.println("Index : " + index);
            displayItem(temp);
            temp = temp.next;
            index++;
        }
    }

    // method to display an item
    private void displayItem(ItemNode node) {
        System.out.println("ID       : " + node.itemId);
        System.out.println("Name     : " + node.itemName);
        System.out.println("Quantity : " + node.quantity);
        System.out.println("Price    : " + node.price);
        System.out.println("-----------------------");
    }
}
