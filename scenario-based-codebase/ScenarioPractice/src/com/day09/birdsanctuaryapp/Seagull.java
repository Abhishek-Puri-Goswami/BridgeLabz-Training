package com.day09.birdsanctuaryapp;

public class Seagull extends Bird implements Flyable, Swimmable {

	public Seagull(int id, String name) {
		super(id, name, "Seagull");
	}

	@Override
	public void eat() {
		System.out.println(getName() + " is eating fish and scraps near the beach.");
	}

	@Override
	public void fly() {
		System.out.println(getName() + " is gliding over the ocean.");
	}

	@Override
	public void swim() {
		System.out.println(getName() + " is floating on the sea surface.");
	}
}