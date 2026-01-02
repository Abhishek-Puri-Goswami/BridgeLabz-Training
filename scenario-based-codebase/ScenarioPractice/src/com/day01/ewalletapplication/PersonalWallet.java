package com.day01.ewalletapplication;

public class PersonalWallet extends Wallet {

	// Refer earn
    public PersonalWallet(double initialBalance) {
        super(initialBalance + 100);
    }
    
    @Override
    public void transferTo(User receiver, double amount) {
        if (amount <= 5000 && debit(amount)) {
            receiver.getWallet().credit(amount);
            System.out.println("Personal Wallet Transfer Successful");
        } else {
            System.out.println("Transfer Failed (Limit or Balance)");
        }
    }
}
