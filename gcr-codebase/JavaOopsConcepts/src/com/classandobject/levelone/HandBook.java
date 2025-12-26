package com.classandobject.levelone;

public class HandBook {

	// declaring variables to get book details
	String bookTitle;
	String bookAuthor;
	double price;

	// constructor
	HandBook(String bookTitle, String bookAuthor, double price) {
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.price = price;
	}

	// creating method to display book details
	public void displayBookDetails() {
		System.out.println("Title of the book: " + bookTitle);
		System.out.println("Author of the book: " + bookAuthor);
		System.out.println("Price of the book: " + price);
	}

	public static void main(String[] args) {

		// creating objects
		HandBook book1 = new HandBook("2 States", "Chetan Bhagat", 500);
		HandBook book2 = new HandBook("Wings Of Fire", "A. P. J. Abdul Kalam", 500);

		// calling display method
		book1.displayBookDetails();
		book2.displayBookDetails();
	}
}
