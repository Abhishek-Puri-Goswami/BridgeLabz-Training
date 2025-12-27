package com.constructors.levelone;

public class Book {
	// Instance variables
	private String title;
	private String author;
	private double price;

    // Default Constructor
    public Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }
    
    // Parameterized Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // method to display book details
    public void display() {
        System.out.println("{ " + title + ", " + author + ", " + price + " }");
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java Basics", "James Gosling", 499.0);

        b1.display();
        b2.display();
    }
}
