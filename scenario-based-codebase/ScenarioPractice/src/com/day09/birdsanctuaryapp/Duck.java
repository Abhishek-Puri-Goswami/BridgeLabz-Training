package com.day09.birdsanctuaryapp;

public class Duck extends Bird implements Flyable, Swimmable {

	public Duck(int id, String name) {
		super(id, name, "Duck");
	}

	@Override
	public void eat() {
		System.out.println(getName() + " is eating grains and small fish.");
	}

	@Override
	public void fly() {
		System.out.println(getName() + " is flying low over the pond.");
	}

	@Override
	public void swim() {
		System.out.println(getName() + " is swimming gracefully in the water.");
	}
}