package com.day06.medistoreapplication;

// Preserved medicine (longer shelf life)
public class Tablet extends Medicine {

	// constructor
    public Tablet(String name, double price, String expiryDate, int quantity) {
        super(name, price, expiryDate, quantity);
    }

    // method to check if tablet expired
    @Override
    public boolean checkExpiry(String today) {
        return !isExpired(today);
    }

    // method to calculate final selling amount for tablet
    @Override
    public double sell(int units, String today) {
        if (!checkExpiry(today) || !reduceStock(units)) return 0;

        double total = price * units;
        setDiscount(total * 0.05);
        return finalAmount(total);
    }

    @Override
    public String getType() {
        return "Tablet";
    }
}
