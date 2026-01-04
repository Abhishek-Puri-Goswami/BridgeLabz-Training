/**
* 7. "MyBank – Managing Customer Accounts"
* Story: You're building the core banking module for MyBank, a digital-first bank. 
* Your job is to manage customer accounts, deposits, and interest calculations.
* Requirements:
* Account (base class): fields like accountNumber, balance.
* Derived classes: SavingsAccount, CurrentAccount (using inheritance).
* ITransaction interface: deposit(), withdraw(), checkBalance().
* Use constructors for account initialization with or without an opening balance.
* Encapsulation: balance must be private and only modifiable through methods.
* Use operators for interest: balance * interestRate / 100.
* Polymorphism in calculateInterest() – varies by account type.
* Use access modifiers: protect account data, expose only required operations.
*/

package com.day02.mybankapplication;

import java.util.Scanner;

public class MyBankApplication {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("===================================");
		System.out.println("        Welcome to MyBank");
		System.out.println("===================================");

		System.out.print("-> Enter Account Number: ");
		String accNo = input.nextLine();

		System.out.print("-> Enter Opening Balance: ");
		double balance = input.nextDouble();

		System.out.println("Select Account Type:");
		System.out.println("1. Savings Account");
		System.out.println("2. Current Account");
		System.out.print("-> Enter choice: ");
		int choice = input.nextInt();

		Account account = null;

		if (choice == 1) {
			account = new SavingsAccount(accNo, balance);
		} else  if(choice == 2) {
			account = new CurrentAccount(accNo, balance);
		} else {
			System.err.println("Invalid account type!");
			System.exit(0);
		}

		System.out.print("-> Enter deposit amount: ");
		double depositAmount = input.nextDouble();
		account.deposit(depositAmount);
		System.out.println("Final Balance: Rs." + account.checkBalance());

		System.out.print("-> Enter withdrawal amount: ");
		double withdrawAmount = input.nextDouble();
		account.withdraw(withdrawAmount);
		System.out.println("Final Balance: Rs." + account.checkBalance());

		account.calculateInterest();
		System.out.println("Final Balance: Rs." + account.checkBalance());

		System.out.println("===================================");
		System.out.println("       Thanks for visiting");
		System.out.println("===================================");
		input.close();
	}
}
