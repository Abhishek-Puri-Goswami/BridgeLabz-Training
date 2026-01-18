package com.day10.bagnballorganizerapp;

import java.util.ArrayList;
import java.util.List;

public class Bag implements Storable {
	private static int nextId = 1;

	private int id;
	private String color;
	private int capacity;
	private List<Ball> balls = new ArrayList<>();

	// Constructor
	public Bag(String color, int capacity) {
		this.id = nextId++;
		this.color = color;
		this.capacity = capacity;
	}

	// Returns unique Id
	public int getId() {
		return id;
	}

	// Returns color
	public String getColor() {
		return color;
	}

	// Returns maximum capacity
	public int getCapacity() {
		return capacity;
	}

	// Returns current ball count
	public int getCurrentCount() {
		return balls.size();
	}

	// Adds ball if not full
	public boolean addBall(Ball ball) {
		if (balls.size() < capacity) {
			balls.add(ball);
			return true;
		}
		return false;
	}

	// Checks if ball is already in this bag
	public boolean containsBall(Ball ball) {
		return balls.contains(ball);
	}

	// Removes ball by Id
	public boolean removeBallById(int ballId) {
		for (int i = 0; i < balls.size(); i++) {
			if (balls.get(i).getId() == ballId) {
				balls.remove(i);
				return true;
			}
		}
		return false;
	}

	// Displays bag and its contents
	public void displayContents() {
		System.out.printf("Bag Id: %d | Color: %s | Capacity: %d | Balls: %d%n", id, color, capacity, balls.size());
		if (balls.isEmpty()) {
			System.out.println("  (Empty)");
		} else {
			System.out.println("  Contained balls:");
			for (Ball ball : balls) {
				System.out.println("    " + ball.getInfo());
			}
		}
	}

	// good string representation
	@Override
	public String getInfo() {
		return String.format("Bag ID: %d, Color: %s, Capacity: %d, Balls count: %d", id, color, capacity, balls.size());
	}
}