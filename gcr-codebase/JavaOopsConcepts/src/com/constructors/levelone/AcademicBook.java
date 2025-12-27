package com.constructors.levelone;

public class AcademicBook {

    // Public
    public String ISBN;

    // Protected
    protected String title;

    // Private
    private String author;

    // constructor
    public AcademicBook(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // method to set author name
    public void setAuthor(String author) {
        this.author = author;
    }

    // method to get author name
    public String getAuthor() {
        return author;
    }
}
