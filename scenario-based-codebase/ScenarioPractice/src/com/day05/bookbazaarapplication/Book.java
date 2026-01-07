package com.day05.bookbazaarapplication;

// Base class for all books
public abstract class Book implements IDiscountable {

    protected String title;
    protected String author;
    protected double price;

    private int stock;

    // Constructor without offer
    public Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    // Updates inventory safely
    public boolean reduceStock(int qty) {
        if (qty <= stock) {
            stock -= qty;
            return true;
        }
        return false;
    }

    // getters
    public int getStock() {
        return stock;
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public abstract String getType();
}
