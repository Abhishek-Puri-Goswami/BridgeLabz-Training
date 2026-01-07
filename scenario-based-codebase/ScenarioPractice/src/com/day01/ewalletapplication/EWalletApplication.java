/*
4. E-Wallet Application
Scenario: Users can register, load money, transfer funds, and view transaction history.
Concepts Used:
● Class: User, Wallet, Transaction
● Constructors: Initialize wallets with optional referral bonus
● Access Modifiers: Make balance private, expose via getBalance()
● Interface: Transferrable with method transferTo(User receiver, double
amount)
● Operators: Used in deductions, taxes, referral credits
● OOP:
○ Encapsulation: Prevent direct manipulation of balance
○ Abstraction: Expose only essential transaction methods
○ Inheritance: PersonalWallet, BusinessWallet with different limits
○ Polymorphism: Same transferTo() method but different business logic
*/

package com.day01.ewalletapplication;

public class EWalletApplication {
	
    public static void main(String[] args) {

        User ravi = new User("Ravi", new PersonalWallet(1000));
        User vaidik = new User("Vaidik", new BusinessWallet(5000));

        // Polymorphism
        ravi.getWallet().transferTo(vaidik, 2000);
        vaidik.getWallet().transferTo(ravi, 1000);

        System.out.println("--------------------");
        System.out.println("Ravi Balance : Rs." + ravi.getWallet().getBalance());
        System.out.println("Vaidik Balance  : Rs." + vaidik.getWallet().getBalance());
        System.out.println("--------------------");

        System.out.println("Ravi Transactions:");
        ravi.getWallet().printTransactions();
    }
}
