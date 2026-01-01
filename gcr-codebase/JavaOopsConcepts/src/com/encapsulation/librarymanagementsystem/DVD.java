package com.encapsulation.librarymanagementsystem;

public class DVD extends LibraryItem implements Reservable {

    private boolean available = true;
    private String borrowerName; // secured personal data

    // Constructor to initialize DVD
    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    // Loan duration for DVDs
    @Override
    public int getLoanDuration() {
        return 3;
    }

    // Reserve DVD
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
