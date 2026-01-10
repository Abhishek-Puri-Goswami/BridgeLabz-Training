package com.day01.bookselfapp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class BookShelf {
	
	// genre : books linkedlist
    private final Map<String, LinkedList<Book>> shelf;

    public BookShelf() {
        this.shelf = new HashMap<>();
    }

    public void addBook(String genre, String title, String author, String isbn) {
        Book book = new Book(title, author, isbn);
        LinkedList<Book> books = shelf.computeIfAbsent(genre.toLowerCase(), _ -> new LinkedList<>());
        books.add(book);
        System.out.println("Book added successfully: " + book);
    }

    public boolean borrowBook(String genre, String title) {
        LinkedList<Book> books = shelf.get(genre.toLowerCase());
        if (books == null) {
            System.out.println("Genre '" + genre + "' not found.");
            return false;
        }

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title.trim()) && book.isAvailable()) {
                book.borrow();
                System.out.println("Successfully borrowed: " + book);
                return true;
            }
        }
        System.out.println("Sorry, '" + title + "' is not available in " + genre);
        return false;
    }

    public boolean returnBook(String genre, String title) {
        LinkedList<Book> books = shelf.get(genre.toLowerCase());
        if (books == null) return false;

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title.trim()) && !book.isAvailable()) {
                book.returnBook();
                System.out.println("Successfully returned: " + book);
                return true;
            }
        }
        System.out.println("'" + title + "' was not borrowed or not found.");
        return false;
    }

    public boolean removeBook(String genre, String title) {
        LinkedList<Book> books = shelf.get(genre.toLowerCase());
        if (books == null) return false;

        Iterator<Book> it = books.iterator();
        while (it.hasNext()) {
            Book book = it.next();
            if (book.getTitle().equalsIgnoreCase(title.trim())) {
                it.remove();
                System.out.println("Book removed: " + book);
                if (books.isEmpty()) {
                	shelf.remove(genre.toLowerCase());
                }
                return true;
            }
        }
        return false;
    }

    public void displayGenre(String genre) {
        LinkedList<Book> books = shelf.get(genre.toLowerCase());
        if (books == null || books.isEmpty()) {
            System.out.println("No books found in genre: " + genre);
            return;
        }

        System.out.println("\n=== " + genre.toUpperCase() + " ===");
        int i = 1;
        for (Book b : books) {
            System.out.printf("%02d. %s%n", i++, b);
        }
    }

    public void displayAll() {
        if (shelf.isEmpty()) {
            System.out.println("Library is empty.");
            return;
        }
        System.out.println("\n===== LIBRARY BOOKSHELF =====");
        for (String genre : shelf.keySet()) {
            displayGenre(genre);
        }
    }
}