package com.day06.medistoreapplication;

// Injection medicine (no discount)
public class Injection extends Medicine {

	// constructor
    public Injection(String name, double price, String expiryDate, int quantity) {
        super(name, price, expiryDate, quantity);
    }

    // method to check if injection expired
    @Override
    public boolean checkExpiry(String today) {
        return !isExpired(today);
    }

	// method to calculate final selling amount for injection
    @Override
    public double sell(int units, String today) {
        if (!checkExpiry(today) || !reduceStock(units)) return 0;

        double total = price * units;
        setDiscount(0); // no discount
        return finalAmount(total);
    }

    @Override
    public String getType() {
        return "Injection";
    }
}
