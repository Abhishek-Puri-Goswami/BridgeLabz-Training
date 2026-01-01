package com.encapsulation.librarymanagementsystem;

public interface Reservable {

    void reserveItem(String borrowerName);

    boolean checkAvailability();
}
