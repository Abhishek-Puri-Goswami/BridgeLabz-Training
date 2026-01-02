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
