package com.day02.mybankapplication;

public class SavingsAccount extends Account {

	private final double INTEREST_RATE = 4.0;

	// constructor
	public SavingsAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
	}

	// method to calculate interest
	@Override
	public void calculateInterest() {
		double interest = checkBalance() * INTEREST_RATE / 100;
		addInterest(interest);
		System.out.println("Interest added to Savings Account: Rs." + interest);
	}
}
