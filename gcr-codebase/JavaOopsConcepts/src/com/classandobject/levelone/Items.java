package com.classandobject.levelone;

public class Items {

	// declaring arrays for item details
	String[] itemCode;
	String[] itemName;
	double[] price;

	// constructor
	Items(String[] itemName, String[] itemCode, double[] price) {
		this.itemName = itemName;
		this.itemCode = itemCode;
		this.price = price;
	}

	// method to display item details
	public void displayItems(int i) {
		System.out.println("itemCode : " + itemCode[i]);
		System.out.println("itemPrice : " + price[i]);
		System.out.println("itemName : " + itemName[i]);
		System.out.println("----------------------------");
	}

	public static void main(String[] args) {

		// initializing arrays
		String[] itemName = { "Water bottle", "Rice", "Blackboard" };
		String[] itemCode = { "01AA", "01BB", "02AA" };
		double[] price = { 500, 700, 400 };

		// creating object
		Items item = new Items(itemName, itemCode, price);

		// displaying inventory
		for (int i = 0; i < price.length; i++) {
			item.displayItems(i);
		}
	}
}
