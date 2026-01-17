package com.day06.smartlibraryapp;

import java.util.List;

public class InsertionSort {
	// Adds a new book to the end and shifts it left to maintain sorted order
	public static void insertBook(List<Book> borrowed, Book newBook) {
		// add to end (unsorted position)
		borrowed.add(newBook);

		// index of newly added book
		int i = borrowed.size() - 1;
		Book key = borrowed.get(i);

		int j = i - 1;
		// Shift larger elements right until correct position found
		while (j >= 0 && borrowed.get(j).compareTo(key) > 0) {
			borrowed.set(j + 1, borrowed.get(j));
			j--;
		}
		// place book in correct position
		borrowed.set(j + 1, key);
	}

	// Prints the current sorted borrowed books list
	public static void printBorrowedBooks(List<Book> borrowed, String header) {
		System.out.println(header);
		if (borrowed.isEmpty()) {
			System.out.println("No books borrowed yet.");
			return;
		}

		System.out.println("-----------------------------------------------------------------");
		for (int rank = 1; rank <= borrowed.size(); rank++) {
			System.out.printf("%2d. %s%n", rank, borrowed.get(rank - 1));
		}
		System.out.println("-----------------------------------------------------------------");
	}
}