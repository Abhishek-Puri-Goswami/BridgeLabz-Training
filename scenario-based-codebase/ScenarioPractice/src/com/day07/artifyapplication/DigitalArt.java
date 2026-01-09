package com.day07.artifyapplication;

// Digital art with flexible licensing
public class DigitalArt extends Artwork {

    public DigitalArt(String title, String artist, double price, String licenseType, boolean preview) {
        super(title, artist, price, licenseType, preview);
    }

    @Override
    public void purchase(User user) {
        if (user.deduct(price)) {
            System.out.println("Digital art purchased.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    @Override
    public void license(User user) {
        double licenseFee = price * 0.5;
        if (user.deduct(licenseFee)) {
            System.out.println("Digital art licensed.");
        } else {
            System.out.println("Insufficient balance for license.");
        }
    }
}
