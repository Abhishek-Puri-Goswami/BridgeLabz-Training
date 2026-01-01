package com.encapsulation.librarymanagementsystem;

public class Book extends LibraryItem implements Reservable {

    private boolean available = true;
    private String borrowerName; // secured personal data

    // Constructor to initialize book
    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    // Loan duration for books
    @Override
    public int getLoanDuration() {
        return 14;
    }

    // Reserve book
    @Override
    public void reserveItem(String borrowerName) {
        if (available) {
            this.borrowerName = borrowerName;
            available = false;
        }
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }
}
