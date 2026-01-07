package com.day05.bookbazaarapplication;

// Printed book has lower discount
public class PrintedBook extends Book {

	// constructor
    public PrintedBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    @Override
    public double applyDiscount(double total) {
        return total * 0.05; // 5% discount
    }

    @Override
    public String getType() {
        return "Printed";
    }
}
