package com.objectmodeling.levelone;

public class Bank {
    String bankName;
    int nextAccountNumber = 1001;

    // Constructor to initialize bank
    public Bank(String bankName) {
        this.bankName = bankName;
    }

    // Method to open account for customer (association logic)
    public Account openAccount(Customer customer) {
        Account account = new Account(nextAccountNumber, this);
        nextAccountNumber++;

        customer.addAccount(account);
        return account;
    }
}
