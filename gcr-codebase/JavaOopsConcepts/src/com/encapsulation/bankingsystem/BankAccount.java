package com.encapsulation.bankingsystem;

public abstract class BankAccount {

	private String accountNumber;
	private String holderName;
	private double balance;

	// Constructor to initialize account details
	public BankAccount(String accountNumber, String holderName, double balance) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
	}

	// Concrete method to deposit money
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
	}

	// Concrete method to withdraw money
	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
		}
	}

	// Abstract method for interest calculation
	public abstract double calculateInterest();

	// Method to display account details
	public void displayDetails() {
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Holder Name    : " + holderName);
		System.out.println("Balance        : " + balance);
		System.out.println("Interest       : " + calculateInterest());
	}

	// getter method for balance
	protected double getBalance() {
		return balance;
	}

	// setter method for balance
	protected void setBalance(double balance) {
		this.balance = balance;
	}
}
