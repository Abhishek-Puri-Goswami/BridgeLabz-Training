package com.finalandstatic.levelone;

public class Book {
    // Static variable shared among all books
    private static String libraryName = "City Library";
    // Instance variables
    private String author;
    private String title;
    private final int isbn;
    // Parameterized constructor
    public Book(String author, String title, int isbn) {
        // Resolving ambiguity with this keyword
        this.author = author;
        this.title = title;
        this.isbn = isbn;
    }
    // Method to display library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
    // Method to dislay details
    public void displayDetails() {
        if(this instanceof Book) {
            System.out.println("Author: " + author);
            System.out.println("Title: " + title);
            System.out.println("ISBN: " + isbn);
        } else {
            System.out.println("Invalid book object.");
        }
    }
    // Main method
    public static void main(String[] args) {
        // Display library name
        Book.displayLibraryName();
        // Create book objects
        Book book1 = new Book( "James Gotling", "Operating System", 9165994);
        Book book2 = new Book( "Bejofs Garl", "Space System", 64431);
        // Display details of book1
        book1.displayDetails();
        System.out.println();
        // Display details of book2
        book2.displayDetails();
    }
}