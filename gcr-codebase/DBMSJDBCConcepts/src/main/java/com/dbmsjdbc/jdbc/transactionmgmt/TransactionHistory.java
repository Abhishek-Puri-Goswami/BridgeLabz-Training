package com.dbmsjdbc.jdbc.transactionmgmt;

import java.sql.Timestamp;

public class TransactionHistory {
    private int txnId;
    private int fromAccount;
    private int toAccount;
    private double amount;
    private Timestamp txnTime;

    // default constructor
    public TransactionHistory() {
    }

    // parameterized constructor
    public TransactionHistory(int txnId, int fromAccount, int toAccount, double amount, Timestamp txnTime) {
        this.txnId = txnId;
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
        this.txnTime = txnTime;
    }
}
