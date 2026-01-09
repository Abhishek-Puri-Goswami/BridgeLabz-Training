package com.day07.artifyapplication;

// Print art with fixed licensing
public class PrintArt extends Artwork {

    public PrintArt(String title, String artist, double price, String licenseType) {
        super(title, artist, price, licenseType);
    }

    @Override
    public void purchase(User user) {
        if (user.deduct(price)) {
            System.out.println("Print art purchased.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    @Override
    public void license(User user) {
        System.out.println("Print art cannot be licensed.");
    }
}
