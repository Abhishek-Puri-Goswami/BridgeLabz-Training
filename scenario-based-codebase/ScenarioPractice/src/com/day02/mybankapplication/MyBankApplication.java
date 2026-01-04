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
