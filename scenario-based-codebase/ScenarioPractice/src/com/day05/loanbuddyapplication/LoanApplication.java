package com.day05.loanbuddyapplication;

public abstract class LoanApplication implements IApprovable {

    protected String loanType;
    protected int termMonths;
    protected double annualRate;

    private boolean approved;
    protected Applicant applicant;

    // constructor
    public LoanApplication(String loanType, int termMonths, double annualRate, Applicant applicant) {
        this.loanType = loanType;
        this.termMonths = termMonths;
        this.annualRate = annualRate;
        this.applicant = applicant;
        this.approved = false;
    }

    // method to check eligibility for loan
    protected boolean basicEligibility(int minScore, double minIncome) {
        return applicant.getCreditScore() >= minScore && applicant.getIncome() >= minIncome;
    }

    protected void setApproved(boolean status) {
        this.approved = status;
    }

    public boolean isApproved() {
        return approved;
    }

    // method for EMI calculation
    protected double computeEMI(double principal, double monthlyRate, int months) {
        double pow = Math.pow(1 + monthlyRate, months);
        return principal * monthlyRate * pow / (pow - 1);
    }

    // method to print details
    public void printSummary(double emi) {
        System.out.printf("%-15s %-10d %-10.2f %-10s Rs.%-12.2f%n",
                loanType, termMonths, annualRate, (approved ? "Approved" : "Rejected"), emi);
    }
}
