package com.classandobject.levelone;

public class MobilePhone {

	// declaring variables for phone details
	String brand;
	String model;
	double price;

	// constructor
	MobilePhone(String brand, String model, double price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	// method to display mobile details
	public void displayMobile() {
		System.out.println("Brand of mobile: " + brand);
		System.out.println("Model of mobile: " + model);
		System.out.println("Price of mobile: " + price);
		System.out.println("------------------------------");
	}

	public static void main(String[] args) {

		// creating objects
		MobilePhone mobile1 = new MobilePhone("VIVO", "V29", 15999);
		MobilePhone mobile2 = new MobilePhone("ONE PLUS", "Nord 4", 39999);
		MobilePhone mobile3 = new MobilePhone("APPLE", "iPhone 16 Pro", 79999);

		// calling display method
		mobile1.displayMobile();
		mobile2.displayMobile();
		mobile3.displayMobile();
	}
}
