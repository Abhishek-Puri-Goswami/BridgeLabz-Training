package com.day06.medistoreapplication;

//Base class for all medicines
public abstract class Medicine implements ISellable {

 protected String name;
 protected double price;
 protected String expiryDate;

 private int quantity;
 private double discount;

 // Constructor with default quantity
 public Medicine(String name, double price, String expiryDate) {
     this(name, price, expiryDate, 100);
 }

 // Constructor with custom quantity
 public Medicine(String name, double price, String expiryDate, int quantity) {
     this.name = name;
     this.price = price;
     this.expiryDate = expiryDate;
     this.quantity = quantity;
     this.discount = 0.0;
 }

 // method for stock adjustment
 protected boolean reduceStock(int units) {
     if (units <= quantity) {
         quantity -= units;
         return true;
     }
     return false;
 }

 // setter for discount
 protected void setDiscount(double discount) {
     this.discount = discount;
 }

 // method to get final price
 protected double finalAmount(double total) {
     return total - discount;
 }

 // getter for quantity
 public int getQuantity() {
     return quantity;
 }

 // Simple date comparison (yyyy-mm-dd)
 protected boolean isExpired(String today) {
     return expiryDate.compareTo(today) < 0;
 }

 public abstract String getType();
}
