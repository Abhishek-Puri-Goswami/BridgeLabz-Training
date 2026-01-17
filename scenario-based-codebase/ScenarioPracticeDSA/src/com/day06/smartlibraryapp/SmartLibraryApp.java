/*
2. SmartLibrary – Auto-Sort Borrowed Books (Insertion Sort)
Story: 
	● A digital kiosk in a library maintains a list of books a user has borrowed. 
	● Every time a new book is issued, the system adds it to the user's list 
	  while keeping it alphabetically sorted by title. 
	● Since insertions are done one at a time, and the list is usually already sorted, 
	  Insertion Sort is the perfect fit.
Concepts Involved:
	● Insertion Sort
	● Dynamic list insertion
	● Nearly sorted data
*/

package com.day06.smartlibraryapp;

import java.util.ArrayList;

public class SmartLibraryApp {
	public static void main(String[] args) {
		System.out.println("========================= SmartLibrary ==========================\n");

		ArrayList<Book> borrowed = new ArrayList<>();

		// Initial empty list
		InsertionSort.printBorrowedBooks(borrowed, "Initial Borrowed List");

		// Added example books in random
		Book[] issueBooks = { new Book("1984", "George Orwell"), new Book("The Great Gatsby", "F. Scott Fitzgerald"),
				new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling"),
				new Book("To Kill a Mockingbird", "Harper Lee"), new Book("The Catcher in the Rye", "J.D. Salinger"),
				new Book("Pride and Prejudice", "Jane Austen"), new Book("Animal Farm", "George Orwell"),
				new Book("The Lord of the Rings", "J.R.R. Tolkien") };

		// Issue each book and show updated sorted list
		for (Book newBook : issueBooks) {
			System.out.printf("%n>> Issuing new book: %s by %s%n%n", newBook.getTitle(), newBook.getAuthor());
			InsertionSort.insertBook(borrowed, newBook);
			InsertionSort.printBorrowedBooks(borrowed, "Updated Borrowed List (always sorted)");
		}

		// Display the results
		InsertionSort.printBorrowedBooks(borrowed, "\nFinal Borrowed Books List");
		System.out.println("\n===================== Thanks for using ==========================");
	}
}