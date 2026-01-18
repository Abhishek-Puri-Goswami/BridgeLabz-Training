package com.day10.bagnballorganizerapp;

public class Ball implements Storable {
	private static int nextId = 1;

	private int id;
	private String color;
	private String size; // "small", "medium", "large"

	// Constructor
	public Ball(String color, String size) {
		this.id = nextId++;
		this.color = color;
		this.size = size;
	}

	// Returns unique Id
	public int getId() {
		return id;
	}

	// Returns color
	public String getColor() {
		return color;
	}

	// Returns size (lowercase)
	public String getSize() {
		return size;
	}

	// good string representation
	@Override
	public String getInfo() {
		String sizeDisplay = size.substring(0, 1).toUpperCase() + size.substring(1);
		return String.format("Ball ID: %d, Color: %s, Size: %s", id, color, sizeDisplay);
	}
}