package com.dbmsjdbc.jdbc.librarymgmt;

public class Book {

    private int bookId;
    private String title;
    private String author;
    private String genre;
    private int copiesAvailable;

    public Book(int bookId, String title, String author, String genre, int copiesAvailable) {

	this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.copiesAvailable = copiesAvailable;
    }
}
