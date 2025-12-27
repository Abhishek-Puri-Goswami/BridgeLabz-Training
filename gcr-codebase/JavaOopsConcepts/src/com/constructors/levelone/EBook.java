package com.constructors.levelone;

public class EBook extends AcademicBook {

	// constructor
	public EBook(String ISBN, String title, String author) {
		super(ISBN, title, author);
	}

	// method to display the results
	public void displayEBookDetails() {
		System.out.println("ISBN: " + ISBN);
		System.out.println("Title: " + title);
		System.out.println("Author: " + getAuthor());
	}

	// main - driver method
	public static void main(String[] args) {
		EBook ebook = new EBook("127-12337", "Java Programming", "E. Balaguruswami");
		ebook.displayEBookDetails();
	}
}
