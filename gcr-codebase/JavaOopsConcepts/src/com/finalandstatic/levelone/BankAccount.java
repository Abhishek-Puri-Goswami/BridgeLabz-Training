package com.finalandstatic.levelone;

public class BankAccount {
    // Attributes
    public static String bankName = "Global Bank";
    public static int totalAccounts = 0;

    private final int accountNumber;
    private String accountHolderName;
    private double balance;
    // Parameterized constructor
    public BankAccount(String accountHolderName, int accountNumber, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        totalAccounts++;
    }
    // Method to return total number of accounts
    public static int getTotalAccounts() {
        return totalAccounts;
    }
    // Method to display the details
    public void displayDetails() {
        if(this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder Name: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Invalid account object.");
        }
    }
    // Main method
    public static void main(String[] args) {
        // Using parameterized constructor
        BankAccount account1 = new BankAccount("Adarsh Patel", 66562326, 9500000);
        BankAccount account2 = new BankAccount("Arpit Patel", 694616, 9800000);
        // Call the display method
        account1.displayDetails();
        account2.displayDetails();
        // Display the number of accounts in the bank
        System.out.println("Total number of accounts in the bank is: " + BankAccount.getTotalAccounts());
    }
}
