package com.constructors.levelone;
import java.util.Scanner;

public class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean available;

    // Constructor
    public LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    // Method to borrow book
    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully");
        } else {
            System.out.println("Book not available");
        }
    }

    // method to display book details
    public void display() {
        System.out.println("{ title:" + title + ", author:" + author + ", price:" + price + ", available:" + available + " }");
    }
    
    // main - driver method
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	System.out.print("Enter book title: ");
        String title = input.nextLine();
        System.out.print("Enter book author: ");
        String author = input.nextLine();
        System.out.print("Enter book price: ");
        double price = input.nextDouble();
    	
    	LibraryBook book = new LibraryBook(title, author, price);
    	book.display();
        book.borrowBook(); //borrowed
        book.display();
        book.borrowBook(); //unavailable
        input.close();
    }
}
