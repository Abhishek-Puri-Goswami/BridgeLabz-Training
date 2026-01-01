package com.encapsulation.librarymanagementsystem;

public class Magazine extends LibraryItem {

    // Constructor to initialize magazine
    public Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    // Loan duration for magazines
    @Override
    public int getLoanDuration() {
        return 7;
    }
}
