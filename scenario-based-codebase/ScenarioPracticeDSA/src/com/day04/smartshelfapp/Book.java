package com.day04.smartshelfapp;

public class Book {
	private final String title;
	private final String author;
	private final int year;

	// constructor
	public Book(String title, String author, int year) {
		this.title = title;
		this.author = author;
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

	// common string representation
	@Override
	public String toString() {
		return String.format("Book-> \"%s\" by %s (%d)", title, author, year);
	}
}