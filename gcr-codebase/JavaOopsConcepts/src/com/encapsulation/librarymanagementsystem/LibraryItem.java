package com.encapsulation.librarymanagementsystem;

public abstract class LibraryItem {

    private int itemId;
    private String title;
    private String author;

    // Constructor to initialize common library item details
    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Abstract method to define loan duration
    public abstract int getLoanDuration();

    // Concrete method to display item details
    public void getItemDetails() {
        System.out.println("Item ID : " + itemId);
        System.out.println("Title   : " + title);
        System.out.println("Author  : " + author);
        System.out.println("Loan Duration (days): " + getLoanDuration());
    }

    // Encapsulated accessors
    public int getItemId() {
        return itemId;
    }

    protected String getTitle() {
        return title;
    }
}
