package com.objectmodeling.levelone;
import java.util.ArrayList;

public class Customer {
    String name;
    ArrayList<Account> accounts;

    // Constructor to initialize customer
    public Customer(String name) {
        this.name = name;
        accounts = new ArrayList<>();
    }

    // Method to add account to customer
    public void addAccount(Account account) {
        accounts.add(account);
    }

    // Method to view balances of all accounts
    public void viewBalance() {
        System.out.println("\nCustomer Name: " + name);

        // Loop to display all associated accounts
        for (Account account : accounts) {
            System.out.println("-----------------------");
            account.displayAccount();
        }
    }
}
