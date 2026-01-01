package com.encapsulation.bankingsystem;

public class CurrentAccount extends BankAccount {

	private double interestRate = 2.0;

	// Constructor to initialize current account
	public CurrentAccount(String accountNumber, String holderName, double balance) {
		super(accountNumber, holderName, balance);
	}

	// Interest calculation for current account
	@Override
	public double calculateInterest() {
		return getBalance() * interestRate / 100;
	}
}
