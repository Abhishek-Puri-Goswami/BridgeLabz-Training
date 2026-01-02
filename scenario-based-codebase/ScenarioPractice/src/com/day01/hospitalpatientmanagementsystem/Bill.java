package com.day01.hospitalpatientmanagementsystem;

public class Bill implements Payable {

	private double baseAmount;
	private double tax;
	private double discount;

	public Bill(double baseAmount, double tax, double discount) {
		this.baseAmount = baseAmount;
		this.tax = tax;
		this.discount = discount;
	}

	@Override
	public double calculatePayment() {
		double taxAmount = baseAmount * tax;
		return baseAmount + taxAmount - discount;
	}
}
