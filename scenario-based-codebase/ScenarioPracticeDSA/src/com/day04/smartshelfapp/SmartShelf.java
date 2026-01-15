package com.day04.smartshelfapp;

import java.util.ArrayList;
import java.util.List;

public class SmartShelf {
	private List<Book> readingList;

	// constructor
	public SmartShelf() {
		readingList = new ArrayList<>();
	}

	/**
	 * Adds a book and immediately inserts it into the correct sorted position using
	 * Insertion Sort logic (stable, efficient for nearly-sorted lists).
	 */
	public void addBook(Book book) {
		// temporarily add at end
		readingList.add(book);

		// Insertion Sort: move the newly added book left until in correct position
		int currentIndex = readingList.size() - 1;

		while (currentIndex > 0) {
			Book current = readingList.get(currentIndex);
			Book previous = readingList.get(currentIndex - 1);

			// Compare titles case-insensitively
			if (previous.getTitle().compareToIgnoreCase(current.getTitle()) > 0) {
				// Swap
				readingList.set(currentIndex, previous);
				readingList.set(currentIndex - 1, current);
				currentIndex--;
			} else {
				break;
			}
		}

		System.out.println("Added & sorted: " + book);
	}

	public void displayReadingList() {
		if (readingList.isEmpty()) {
			System.out.println("Your reading list is empty.");
			return;
		}

		System.out.println("\nCurrent Reading List (sorted by title):");
		System.out.println("-------------------------------------------------------------");
		int index = 1;
		for (Book b : readingList) {
			System.out.printf("%2d. %s%n", index++, b);
		}
		System.out.println("-------------------------------------------------------------");
		System.out.println("Total books: " + readingList.size() + "\n");
	}

	public int getBookCount() {
		return readingList.size();
	}
}