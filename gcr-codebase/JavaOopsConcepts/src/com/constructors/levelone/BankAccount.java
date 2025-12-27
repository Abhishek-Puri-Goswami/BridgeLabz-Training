package com.constructors.levelone;

public class BankAccount {
    // Public
    public String accountNumber;

    // Protected
    protected String accountHolder;

    // Private
    private double balance;

    // constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Returns current balance
    public double getBalance() {
        return balance;
    }

    // Updates balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Displays account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}
