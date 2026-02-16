package com.dbmsjdbc.jdbc.transactionmgmt;

import java.util.Scanner;

public class TransactionManagement {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	BankDAO dao = new BankDAO();

	dao.recreateTables();
	int choice;
	do {
	    System.out.println("\n========== Banking System ==========");
	    System.out.println("1 -> Transfer Money");
	    System.out.println("2 -> Check Balance");
	    System.out.println("3 -> Transaction History");
	    System.out.println("4 -> Print Accounts");
	    System.out.println("0 -> Exit");

	    System.out.print("Enter Choice: ");
	    choice = input.nextInt();
	    input.nextLine();

	    switch (choice) {
	    	case 1:
	    	    System.out.print("From Account ID: ");
	    	    int from = input.nextInt();

	    	    System.out.print("To Account ID: ");
	    	    int to = input.nextInt();

	    	    System.out.print("Amount: ");
	    	    double amt = input.nextDouble();

	    	    dao.transferMoney(from, to, amt);
	    	    break;

		case 2:
		    System.out.print("Holder Name: ");
		    String name = input.nextLine();

		    dao.checkBalance(name);
		    break;

		case 3:
		    dao.viewHistory();
		    break;

		case 4:
		    dao.printAccountTable();
		    break;

		case 0:
		    System.out.println("Exiting...");
		    break;

		default:
		    System.out.println("Invalid Choice");
	    }

	} while (choice != 0);

	input.close();
    }
}
