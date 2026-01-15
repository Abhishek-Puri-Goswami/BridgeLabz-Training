package com.day09.birdsanctuaryapp;

public class Ostrich extends Bird {

	public Ostrich(int id, String name) {
		super(id, name, "Ostrich");
	}

	@Override
	public void eat() {
		System.out.println(getName() + " is eating plants, seeds and small animals.");
	}
}