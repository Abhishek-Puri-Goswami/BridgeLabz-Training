package com.day09.birdsanctuaryapp;

public class Kiwi extends Bird {

	public Kiwi(int id, String name) {
		super(id, name, "Kiwi");
	}

	@Override
	public void eat() {
		System.out.println(getName() + " is eating worms and insects on the ground.");
	}
}