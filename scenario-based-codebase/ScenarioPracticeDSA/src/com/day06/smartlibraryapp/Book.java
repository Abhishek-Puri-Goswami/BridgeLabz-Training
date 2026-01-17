package com.day06.smartlibraryapp;

public class Book implements Comparable<Book> {
    private final String title;
    private final String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title.trim();
        this.author = author.trim();
    }

    public String getTitle() {
        return title;
    }

	public String getAuthor() {
		return author;
	}

    // method to compare books by title
    @Override
    public int compareTo(Book other) {
        return this.title.compareToIgnoreCase(other.title);
    }

    // good string representation
    @Override
    public String toString() {
        return String.format("%-40s by %-20s", title, getAuthor());
    }
}
