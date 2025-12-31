package com.objectmodeling.levelone;

import java.util.ArrayList;

public class Library {

    private String libraryName;
    private ArrayList<Book> books;

    // Constructor to initialize library
    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book); // aggregation
    }

    // Method to display all books in the library
    public void displayLibraryBooks() {
        System.out.println("\nLibrary Name: " + libraryName);

        // Iterate all books in the library
        for (Book book : books) {
            System.out.println("--------------------");
            book.displayBook();
        }
    }
}
