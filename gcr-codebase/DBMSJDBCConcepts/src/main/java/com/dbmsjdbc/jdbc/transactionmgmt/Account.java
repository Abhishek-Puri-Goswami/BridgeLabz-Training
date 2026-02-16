package com.dbmsjdbc.jdbc.transactionmgmt;

public class Account {
    private int accountId;
    private String holderName;
    private double balance;

    // default constructor
    public Account() {
    }

    // parameterized constructor
    public Account(int accountId, String holderName, double balance) {
        this.accountId = accountId;
        this.holderName = holderName;
        this.balance = balance;
    }

    public int getAccountId() {
        return accountId;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }
}
