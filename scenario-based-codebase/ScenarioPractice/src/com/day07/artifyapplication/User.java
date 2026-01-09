package com.day07.artifyapplication;

// Represents a buyer
public class User {

    private String name;
    private double walletBalance;

    public User(String name, double walletBalance) {
        this.name = name;
        this.walletBalance = walletBalance;
    }

    public boolean deduct(double amount) {
        if (walletBalance >= amount) {
            walletBalance -= amount;
            return true;
        }
        return false;
    }

    public void printUser() {
    	System.out.println("\n--- User Wallet ---");
        System.out.printf("| %-15s | %-15s |%n", "User", name);
        System.out.printf("| %-15s | Rs.%-15.2f%n", "Wallet Balance", walletBalance);
    }
}
