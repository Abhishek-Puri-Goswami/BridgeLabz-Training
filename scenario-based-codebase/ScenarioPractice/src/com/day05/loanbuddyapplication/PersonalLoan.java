package com.day05.loanbuddyapplication;

public class PersonalLoan extends LoanApplication {

	// constructor
    public PersonalLoan(int termMonths, Applicant applicant) {
        super("Personal", termMonths, 13.5, applicant);
    }

    // method to approve Personal loan
    @Override
    public boolean approveLoan() {
        boolean eligible = basicEligibility(600, 25000);
        setApproved(eligible);
        return eligible;
    }

    // method to calculate EMI for Personal loan
    @Override
    public double calculateEMI() {
        double monthlyRate = (annualRate / 12) / 100;
        return computeEMI(applicant.getLoanAmount(), monthlyRate, termMonths);
    }
}
