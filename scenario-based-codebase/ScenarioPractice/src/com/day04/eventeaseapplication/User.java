package com.day04.eventeaseapplication;

public class User {

	private String name;
	private String email;

	// constructor
	public User(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public void printDetails() {
		System.out.printf("%-15s : %s%n", "Organizer", name);
		System.out.printf("%-15s : %s%n", "Email", email);
	}
}
