/*
1. BookShelf – Library Organizer (HashMap + Linked List)
    Story: 
	    ● In a library system, books are arranged based on genre and author. 
	    ● A HashMap maps genre → list of books (LinkedList). 
	    ● Each list is dynamically updated when books are borrowed or returned.
    Requirements:
		● Maintain genre-wise catalog.
		● Efficient insert, delete using LinkedList.
		● Avoid duplication using HashSet (optional).
*/

package com.day01.bookselfapp;

import java.util.Scanner;

public class BookShelfApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BookShelf library = new BookShelf();

		System.out.println("=====================================");
		System.out.println("   Welcome to Personal BookShelf App  ");
		System.out.println("=====================================");

		while (true) {
			printMenu();

			int choice = getValidChoice(sc);

			if (choice == 0) {
				System.out.println("\nThank you for using BookShelf. Goodbye!");
				break;
			}

			handleMenuChoice(sc, library, choice);
		}

		sc.close();
	}

	private static void printMenu() {
		System.out.println("\nMENU:");
		System.out.println("1. Add a book");
		System.out.println("2. Borrow a book");
		System.out.println("3. Return a book");
		System.out.println("4. Remove a book");
		System.out.println("5. Show books by genre");
		System.out.println("6. Show all books");
		System.out.println("0. Exit");
		System.out.print("\nEnter your choice (0-6): ");
	}

	private static int getValidChoice(Scanner sc) {
		while (true) {
			try {
				String input = sc.nextLine().trim();
				return Integer.parseInt(input);
			} catch (NumberFormatException e) {
				System.out.print("Please enter a valid number (0-6): ");
			}
		}
	}

	private static void handleMenuChoice(Scanner sc, BookShelf library, int choice) {
		String genre, title;

		switch (choice) {
		case 1:
			System.out.print("Enter genre: ");
			genre = sc.nextLine().trim();

			System.out.print("Enter book title: ");
			title = sc.nextLine().trim();

			System.out.print("Enter author: ");
			String author = sc.nextLine().trim();

			System.out.print("Enter ISBN: ");
			String isbn = sc.nextLine().trim();

			if (title.isEmpty() || author.isEmpty() || isbn.isEmpty()) {
				System.out.println("All fields are required!");
			} else {
				library.addBook(genre, title, author, isbn);
			}
			break;

		case 2:
			System.out.print("Enter genre: ");
			genre = sc.nextLine().trim();
			System.out.print("Enter book title to borrow: ");
			title = sc.nextLine().trim();
			library.borrowBook(genre, title);
			break;

		case 3:
			System.out.print("Enter genre: ");
			genre = sc.nextLine().trim();
			System.out.print("Enter book title to return: ");
			title = sc.nextLine().trim();
			library.returnBook(genre, title);
			break;

		case 4:
			System.out.print("Enter genre: ");
			genre = sc.nextLine().trim();
			System.out.print("Enter book title to remove: ");
			title = sc.nextLine().trim();
			boolean removed = library.removeBook(genre, title);
			System.out.println(removed ? "Book removed successfully." : "Book not found.");
			break;

		case 5:
			System.out.print("Enter genre to display: ");
			genre = sc.nextLine().trim();
			library.displayGenre(genre);
			break;

		case 6:
			library.displayAll();
			break;

		default:
			System.out.println("Invalid choice! Please select 0-6.");
		}
	}
}