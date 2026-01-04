package com.day02.mybankapplication;

public abstract class Account implements ITransaction {

	protected String accountNumber;
	private double balance;

	// constructor 
	public Account(String accountNumber) {
		this.accountNumber = accountNumber;
		this.balance = 0;
	}

	// constructor with opening balance
	public Account(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	// method to deposit money
	@Override
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
	}

	// method to withdraw money
	@Override
	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
		} else {
			System.out.println("Insufficient balance");
		}
	}

	// method to check balance
	@Override
	public double checkBalance() {
		return balance;
	}

	// only subclasses can add interest
	protected void addInterest(double interest) {
		balance += interest;
	}

	// method to calculate interest for different account types
	public abstract void calculateInterest();
}
