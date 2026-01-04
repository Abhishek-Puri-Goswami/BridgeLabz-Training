package com.day02.mybankapplication;

public class CurrentAccount extends Account {

	private final double INTEREST_RATE = 1.0;

	// constructor
	public CurrentAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
	}

	// method to calculate interest 
	@Override
	public void calculateInterest() {
		double interest = checkBalance() * INTEREST_RATE / 100;
		addInterest(interest);
		System.out.println("Interest added to Current Account: Rs." + interest);
	}
}
