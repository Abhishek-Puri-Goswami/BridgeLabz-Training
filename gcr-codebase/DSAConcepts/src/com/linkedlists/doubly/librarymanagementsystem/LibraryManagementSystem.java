package com.linkedlists.doubly.librarymanagementsystem;

public class LibraryManagementSystem {

    public static void main(String[] args) {

        LibraryDoublyLinkedList library = new LibraryDoublyLinkedList();

        library.addFirst(101, "Effective Java", "Joshua Bloch",
                "Programming", true);
        library.addLast(102, "Clean Code", "Robert Martin",
                "Programming", true);
        library.addLast(103, "Harry Potter", "J.K. Rowling",
                "Fantasy", false);

        library.addAtPosition(1, 104, "The Hobbit",
                "J.R.R. Tolkien", "Fantasy", true);

        System.out.println("Library (Forward):");
        library.displayForward();

        System.out.println("Library (Reverse):");
        library.displayReverse();

        System.out.println("Search by Author: J.K. Rowling");
        library.searchByAuthor("J.K. Rowling");

        System.out.println("Update Availability (Book ID 103):");
        library.updateAvailability(103, true);

        System.out.println("Remove Book ID 102:");
        library.removeByBookId(102);

        System.out.println("Final Library:");
        library.displayForward();

        System.out.println("Total Books: " + library.getTotalBooks());
    }
}
