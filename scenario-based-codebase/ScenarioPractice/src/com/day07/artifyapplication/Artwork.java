package com.day07.artifyapplication;

public abstract class Artwork implements IPurchasable {

	protected String title;
	protected String artist;
	protected double price;
	protected String licenseType;
	protected boolean hasPreview;

	public Artwork(String title, String artist, double price, String licenseType) {
		this(title, artist, price, licenseType, false);
	}

	public Artwork(String title, String artist, double price, String licenseType, boolean hasPreview) {
		this.title = title;
		this.artist = artist;
		this.price = price;
		this.licenseType = licenseType;
		this.hasPreview = hasPreview;
	}

	public void printArt() {
		System.out.println("\n--- Artwork Details ---");
		System.out.printf("| %-15s | %-15s | %-15s | %-15s |%n", "Title", "Artist", "Price (in Rs.)", "License");
		System.out.printf("| %-15s | %-15s | %-15.2f | %-15s |%n", title, artist, price, licenseType);
	}
}
