package com.day06.medistoreapplication;

// Liquid medicine (stricter expiry)
public class Syrup extends Medicine {

	// constructor
	public Syrup(String name, double price, String expiryDate, int quantity) {
		super(name, price, expiryDate, quantity);
	}

	// method to check if syrup expired
	@Override
	public boolean checkExpiry(String today) {
		// Liquids expire earlier (treated strictly)
		return !isExpired(today);
	}

	// method to calculate final selling amount for syrup
	@Override
	public double sell(int units, String today) {
		if (!checkExpiry(today) || !reduceStock(units))
			return 0;

		double total = price * units;
		setDiscount(total * 0.10);
		return finalAmount(total);
	}

	@Override
	public String getType() {
		return "Syrup";
	}
}
