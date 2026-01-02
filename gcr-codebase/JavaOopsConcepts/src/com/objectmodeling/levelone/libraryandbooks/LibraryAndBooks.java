package com.objectmodeling.levelone;
import java.util.Scanner;

public class LibraryAndBooks {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter Book 1 Title: ");
		String title1 = input.nextLine();
		System.out.print("Enter Book 1 Author: ");
		String author1 = input.nextLine();

		System.out.print("\nEnter Book 2 Title: ");
		String title2 = input.nextLine();
		System.out.print("Enter Book 2 Author: ");
		String author2 = input.nextLine();

		// Creating independent Book objects
		Book book1 = new Book(title1, author1);
		Book book2 = new Book(title2, author2);

		// Creating Library objects
		Library centralLibrary = new Library("Central Library");
		Library cityLibrary = new Library("City Library");

		// Adding books to libraries (aggregation)
		centralLibrary.addBook(book1);
		centralLibrary.addBook(book2);
		cityLibrary.addBook(book1);

		// Displaying libraries and their books
		centralLibrary.displayLibraryBooks();
		cityLibrary.displayLibraryBooks();
		input.close();
	}
}
