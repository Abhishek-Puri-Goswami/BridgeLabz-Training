package com.day01.ewalletapplication;

public class Transaction {

	private String type;
	private double amount;

	public Transaction(String type, double amount) {
		this.type = type;
		this.amount = amount;
	}

	@Override
	public String toString() {
		return type + " : Rs." + amount;
	}
}
