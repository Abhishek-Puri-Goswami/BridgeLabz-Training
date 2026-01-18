package com.generics.onlinemarketplace;

public class OnlineMarketplaceApp {

	public static void main(String[] args) {
		Catalog catalog = new Catalog();

		// Create different product types
		Product book1 = new Book("Java Programming", 49.99);
		Product book2 = new Book("Science Fiction Novel", 19.99);
		Product shirt = new Clothing("Cotton Shirt", 29.99);
		Product phone = new Gadget("Smartphone Pro", 1199.99);
		Product laptop = new Gadget("Gaming Laptop", 1899.99);

		// Add mixed types to same catalog
		catalog.addProduct(book1);
		catalog.addProduct(book2);
		catalog.addProduct(shirt);
		catalog.addProduct(phone);
		catalog.addProduct(laptop);

		System.out.println("Dynamic Online Marketplace\n");
		catalog.displayCatalog();

		// Apply discount to specific product
		System.out.println("Applying 20% discount to Java book:");
		DiscountUtil.applyDiscount(book1, 20);
		System.out.println("Updated: " + book1 + "\n");

		// Site-wide discount
		System.out.println("Applying 10% site-wide discount:");
		for (Product p : catalog.getProducts()) {
			DiscountUtil.applyDiscount(p, 10);
		}

		catalog.displayCatalog();
	}
}