package com.encapsulation.bankingsystem;

import java.util.ArrayList;

public class BankingSystem {

	public static void main(String[] args) {

		ArrayList<BankAccount> accounts = new ArrayList<>();

		BankAccount acc1 = new SavingsAccount("SB101", "Divyansh", 50000);
		BankAccount acc2 = new CurrentAccount("UB202", "Anita", 80000);

		acc1.deposit(5000);
		acc2.withdraw(10000);

		accounts.add(acc1);
		accounts.add(acc2);

		// Polymorphism: processing different account types
		for (BankAccount account : accounts) {

			account.displayDetails();

			// Check before down casting
			if (account instanceof Loanable) {
				Loanable loanAccount = (Loanable) account;
				loanAccount.applyForLoan(1_00_000);
				System.out.println("Loan Eligibility : " + loanAccount.calculateLoanEligibility());
			}

			System.out.println("---------------------------");
		}
	}
}
