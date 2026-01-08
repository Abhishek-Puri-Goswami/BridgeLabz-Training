package com.day06.medistoreapplication;

// Defines selling and expiry checks
public interface ISellable {
	 // yyyy-mm-dd format
    boolean checkExpiry(String today);  
    double sell(int units, String today);
}
