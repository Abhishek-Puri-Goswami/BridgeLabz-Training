package com.encapsulation.bankingsystem;

public class SavingsAccount extends BankAccount implements Loanable {

	private double interestRate = 4.5;

	// Constructor to initialize savings account
	public SavingsAccount(String accountNumber, String holderName, double balance) {
		super(accountNumber, holderName, balance);
	}

	// Interest calculation for savings account
	@Override
	public double calculateInterest() {
		return getBalance() * interestRate / 100;
	}

	// Method for loan application
	@Override
	public void applyForLoan(double amount) {
		System.out.println("Loan applied for Savings Account: " + amount);
	}

	// Method for eligible load amount
	@Override
	public double calculateLoanEligibility() {
		return getBalance() * 2;
	}
}
