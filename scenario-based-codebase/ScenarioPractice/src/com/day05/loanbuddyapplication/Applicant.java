package com.day05.loanbuddyapplication;

public class Applicant {

    private String name;
	private int creditScore;
    private double income;
    private double loanAmount;

    // constructor
    public Applicant(String name, int creditScore, double income, double loanAmount) {
        this.name = name;
        this.creditScore = creditScore;
        this.income = income;
        this.loanAmount = loanAmount;
    }

    // getters
    public String getName() {
        return name;
    }

    protected int getCreditScore() {
        return creditScore;
    }

    protected double getIncome() {
        return income;
    }

    protected double getLoanAmount() {
        return loanAmount;
    }
}
