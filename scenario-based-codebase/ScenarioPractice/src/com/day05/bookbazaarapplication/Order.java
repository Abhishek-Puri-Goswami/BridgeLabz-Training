package com.day05.bookbazaarapplication;

import java.util.ArrayList;

// Links user with selected books
public class Order {

    private String customerName;
    private ArrayList<Book> books;
    private ArrayList<Integer> quantities;
    private String status;

    // constructor
    public Order(String customerName) {
        this.customerName = customerName;
        this.books = new ArrayList<>();
        this.quantities = new ArrayList<>();
        this.status = "CREATED";
    }

    // method to add book
    public void addBook(Book book, int qty) {
        if (book.reduceStock(qty)) {
            books.add(book);
            quantities.add(qty);
        }
    }

    // Calculates total using operators
    public double calculateTotal() {
        double total = 0;

        // Loop calculates price * quantity
        for (int i = 0; i < books.size(); i++) {
            total += books.get(i).getPrice() * quantities.get(i);
        }

        return total;
    }

    // method to apply discount 
    public double calculateFinalAmount() {
        double total = calculateTotal();
        double discount = 0;

        // Loop applies discount per book type
        for (Book book : books) {
            discount += book.applyDiscount(total);
        }
        double finalAmount = total - discount;
        return (finalAmount < 0? 0 : finalAmount);
    }

    protected void completeOrder() {
        status = "COMPLETED";
    }

    public void printOrderSummary() {
        System.out.printf("%-20s : %s%n", "Customer", customerName);
        System.out.printf("%-20s : %s%n", "Status", status);
    }
}
