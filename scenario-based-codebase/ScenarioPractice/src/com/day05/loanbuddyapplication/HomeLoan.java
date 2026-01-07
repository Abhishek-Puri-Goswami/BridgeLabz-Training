package com.day05.loanbuddyapplication;

public class HomeLoan extends LoanApplication {

	// constructor
    public HomeLoan(int termMonths, Applicant applicant) {
        super("Home", termMonths, 8.5, applicant);
    }

    // method to approve loan applications
    @Override
    public boolean approveLoan() {
        boolean eligible = basicEligibility(700, 40000);
        setApproved(eligible);
        return eligible;
    }

    // method to calculate EMI for Home loans	
    @Override
    public double calculateEMI() {
        double monthlyRate = (annualRate / 12) / 100;
        return computeEMI(applicant.getLoanAmount(), monthlyRate, termMonths);
    }
}
