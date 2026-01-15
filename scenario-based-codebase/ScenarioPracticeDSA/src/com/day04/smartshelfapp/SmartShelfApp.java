/*
2. SmartShelf – Real-Time Book Arrangement (Insertion Sort)
Story: 
	● In a digital library kiosk, as users add books to their reading list, 
	  the system must keep the list sorted alphabetically by title. 
	● Since books are added one at a time and the list is mostly sorted, 
	  Insertion Sort fits perfectly.
Key Concepts:
	● Online/real-time sorting
	● Efficient for nearly sorted data
	● Stable sorting by title
*/

package com.day04.smartshelfapp;

public class SmartShelfApp {
 public static void main(String[] args) {
     SmartShelf shelf = new SmartShelf();

     System.out.println("===== SmartShelf – Digital Library Kiosk =====");
     System.out.println("Books are kept sorted alphabetically by title at all times\n");

     // Users adding books one by one
     shelf.addBook(new Book("The Alchemist", "Paulo Coelho", 1988));
     shelf.displayReadingList();

     shelf.addBook(new Book("Atomic Habits", "James Clear", 2018));
     shelf.displayReadingList();

     shelf.addBook(new Book("To Kill a Mockingbird", "Harper Lee", 1960));
     shelf.displayReadingList();

     shelf.addBook(new Book("1984", "George Orwell", 1949));
     shelf.displayReadingList();

     shelf.addBook(new Book("Pride and Prejudice", "Jane Austen", 1813));
     shelf.displayReadingList();

     shelf.addBook(new Book("Sapiens: A Brief History of Humankind", "Yuval Noah Harari", 2011));
     shelf.displayReadingList();

     shelf.addBook(new Book("The Alchemist", "Paulo Coelho", 2006));
     shelf.displayReadingList();

     System.out.println("Final reading list size: " + shelf.getBookCount());
     System.out.println("All books remain sorted after every addition.");
 }
}