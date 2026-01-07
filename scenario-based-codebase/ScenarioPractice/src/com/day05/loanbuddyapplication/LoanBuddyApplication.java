/*
14. "LoanBuddy – Loan Approval Automation"
Story: A fintech startup named FinlyTech is launching a product called LoanBuddy, a web and
mobile app that automates personal loan approvals for salaried and self-employed applicants.
LoanBuddy should collect applicant data, verify eligibility, evaluate credit risk, and either
approve or reject the loan based on custom rules. It also calculates monthly EMIs and provides
a personalized repayment plan.
You’re hired as a Java backend developer to design and implement the core loan approval
engine.
Requirements:
● Applicant class: name, creditScore, income, loanAmount.
● LoanApplication class with loan type, term, and interest rate.
● Interface IApprovable with approveLoan() and calculateEMI().
● Use constructors to support different types of loans (personal, home, auto).
● Operators for EMI calculation: P × R × (1+R)^N / ((1+R)^N – 1)
● Encapsulation: keep credit score and internal approval logic private.
● Inheritance: different loan types (HomeLoan, AutoLoan) extending base class.
● Polymorphism: EMI calculation logic varies by loan type.
● Access modifiers to limit loan status changes to internal processes only.
*/

package com.day05.loanbuddyapplication;

import java.util.Scanner;

public class LoanBuddyApplication {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Applicant input
		System.out.print("Enter Name: ");
		String name = input.nextLine();

		System.out.print("Enter Credit Score: ");
		int score = input.nextInt();

		System.out.print("Enter Monthly Income (Rs.): ");
		double income = input.nextDouble();

		System.out.print("Enter Loan Amount (Rs.): ");
		double amount = input.nextDouble();

		Applicant applicant = new Applicant(name, score, income, amount);

		// Loan selection
		System.out.println("\nSelect Loan Type:");
		System.out.println("1. Personal");
		System.out.println("2. Home");
		System.out.println("3. Auto");
		System.out.print("Choice: ");
		int choice = input.nextInt();

		System.out.print("Enter Loan Term (months): ");
		int months = input.nextInt();

		LoanApplication loan;
		if (choice == 2) {
			loan = new HomeLoan(months, applicant);
		} else if (choice == 3) {
			loan = new AutoLoan(months, applicant);
		} else {
			loan = new PersonalLoan(months, applicant);
		}

		boolean approved = loan.approveLoan();
		double emi = approved ? loan.calculateEMI() : 0.0;

		// Output
		System.out.println("\n--- Loan Decision ---");
		System.out.printf("%-15s %-10s%n", "Applicant", applicant.getName());
		System.out.printf("%-15s %-10s%n", "Status", approved ? "Approved" : "Rejected");

		System.out.println("\n--- Loan Summary ---");
		System.out.printf("%-15s %-10s %-10s %-10s %-12s%n", "Type", "Term", "Rate(%)", "Status", "EMI");
		loan.printSummary(emi);

		input.close();
	}
}
