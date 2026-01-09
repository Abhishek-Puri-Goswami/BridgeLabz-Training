package com.day07.artifyapplication;

import java.util.Scanner;

public class ArtifyApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter User Name: ");
        String name = input.nextLine();

        System.out.print("Enter Wallet Balance (Rs.): ");
        double balance = input.nextDouble();
        input.nextLine();

        User user = new User(name, balance);

        System.out.print("Enter Artwork Title: ");
        String title = input.nextLine();

        System.out.print("Enter Artist Name: ");
        String artist = input.nextLine();

        System.out.print("Enter Price (Rs.): ");
        double price = input.nextDouble();
        input.nextLine();

        System.out.print("Enter License Type: ");
        String license = input.nextLine();

        System.out.println("Select Art Type:");
        System.out.println("1. Digital");
        System.out.println("2. Print");
        System.out.print("Choice: ");
        int type = input.nextInt();

        Artwork art;
        if (type == 1) {
            art = new DigitalArt(title, artist, price, license, true);
        } else {
            art = new PrintArt(title, artist, price, license);
        }

        art.printArt();

        System.out.println("\n1. Purchase");
        System.out.println("2. License");
        System.out.print("Select Action: ");
        int action = input.nextInt();

        if (action == 1) {
            art.purchase(user);
        } else {
            art.license(user);
        }

        user.printUser();

        input.close();
    }
}
