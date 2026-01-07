package com.day05.bookbazaarapplication;

// EBook has higher discount
public class EBook extends Book {

	// constructor
    public EBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    @Override
    public double applyDiscount(double total) {
        return total * 0.15;
    }

    @Override
    public String getType() {
        return "EBook";
    }
}
