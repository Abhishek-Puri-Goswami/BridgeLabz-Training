/*
15. "BookBazaar – Digital Bookstore System"
Story: You’re building the backend for BookBazaar, an online bookstore. It must handle book
inventory, orders, and discounts.
Requirements:
● Book class with fields: title, author, price, stock.
● Order class that links a user to one or more books.
● Interface IDiscountable with method applyDiscount().
● Use constructors to create books with optional offers.
● Use operators to compute total cost: price × quantity – discount.
● Encapsulation: inventory count should only be updated through methods.
● Inheritance: EBook, PrintedBook extend Book.
● Polymorphism: applyDiscount() works differently for each book type.
● Access modifiers used to restrict order status updates.
*/

package com.day05.bookbazaarapplication;

import java.util.Scanner;

public class BookBazaarApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        String customer = input.nextLine();

        Order order = new Order(customer);

        System.out.print("Enter number of books: ");
        int n = input.nextInt();
        input.nextLine();

        // Loop to add books to order
        for (int i = 1; i <= n; i++) {

            System.out.println("\nBook " + i);
            System.out.print("Title: ");
            String title = input.nextLine();

            System.out.print("Author: ");
            String author = input.nextLine();

            System.out.print("Price (Rs.): ");
            double price = input.nextDouble();

            System.out.print("Stock: ");
            int stock = input.nextInt();

            System.out.print("Quantity: ");
            int qty = input.nextInt();

            System.out.println("Type: 1.EBook  2.Printed");
            int type = input.nextInt();
            input.nextLine();

            Book book;
            if (type == 1) {
                book = new EBook(title, author, price, stock);
            } else {
                book = new PrintedBook(title, author, price, stock);
            }

            order.addBook(book, qty);
        }

        double total = order.calculateTotal();
        double finalAmount = order.calculateFinalAmount();

        System.out.println("\n--- Order Summary ---");
        order.printOrderSummary();

        System.out.println("\n--- Billing ---");
        System.out.printf("%-20s Rs.%-10.2f%n", "Total Amount", total);
        System.out.printf("%-20s Rs.%-10.2f%n", "Final Amount", finalAmount);

        input.close();
    }
}
