package com.day01.bookselfapp;

public class Book {
	private final String title;
	private final String author;
	private final String isbn;
	private boolean isAvailable;

	public Book(String title, String author, String isbn) {
		this.title = title.trim();
		this.author = author.trim();
		this.isbn = isbn.trim();
		this.isAvailable = true;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getIsbn() {
		return isbn;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void borrow() {
		isAvailable = false;
	}

	public void returnBook() {
		isAvailable = true;
	}

	@Override
	public String toString() {
		return String.format("\"%s\" by %s (ISBN: %s) - %s", title, author, isbn,
				isAvailable ? "Available" : "Borrowed");
	}
	
	@Override
	public int hashCode() {
		int result = this.title.hashCode();
		result = 31 * result + this.author.hashCode();
		return result;
	}
	
	@Override
	public boolean equals(Object anObject) {
		if(this == anObject) {
			return true;
		}
		
		if(anObject == null || getClass() != anObject.getClass()) {
			return false;
		}
		
		Book book = (Book) anObject;
		if(!this.title.equals(book.title)) {
			return false;
		}
		
		return !this.author.equals(book.author);
	}
	
	public static void main(String[] args) {
		Book b1 = new Book("Conjuring", "Goswami", "1234567890123");
		Book b2 = new Book("Conjuring", "Goswami", "1234567890123");
		
		System.out.println(b1.equals(b2));
	}
}