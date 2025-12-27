package com.constructors.levelone;

public class SavingsAccount extends BankAccount {
    // constructor
    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    // method access to public and protected members
    public void displaySavingsAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + getBalance());
    }

    // main - driver method
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount("SB1001", "Abhishek", 9999999);

        account.displaySavingsAccountDetails();

        account.setBalance(0.15);
        System.out.println("Updated Balance: " + account.getBalance());
    }
}
