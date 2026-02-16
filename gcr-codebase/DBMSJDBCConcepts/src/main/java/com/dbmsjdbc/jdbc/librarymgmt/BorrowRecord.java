package com.dbmsjdbc.jdbc.librarymgmt;

import java.sql.Date;

public class BorrowRecord {

    private int borrowId;
    private int studentId;
    private int bookId;
    private Date borrowDate;
    private Date returnDate;
    private double fineAmount;

    public BorrowRecord() {
    }
}
