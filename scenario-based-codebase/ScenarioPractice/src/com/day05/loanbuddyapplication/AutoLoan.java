package com.day05.loanbuddyapplication;

public class AutoLoan extends LoanApplication {

	// constructor
    public AutoLoan(int termMonths, Applicant applicant) {
        super("Auto", termMonths, 10.0, applicant);
    }

    // method to approve loans
    @Override
    public boolean approveLoan() {
        boolean eligible = basicEligibility(650, 30000);
        setApproved(eligible);
        return eligible;
    }

    // method to calculate EMI for Auto loan
    @Override
    public double calculateEMI() {
        double monthlyRate = (annualRate / 12) / 100;
        return computeEMI(applicant.getLoanAmount(), monthlyRate, termMonths);
    }
}
