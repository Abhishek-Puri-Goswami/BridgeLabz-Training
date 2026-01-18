package com.day10.geomeasuresapp;

public class LineSegment {
	private double x1;
	private double y1;
	private double x2;
	private double y2;

	// Constructor
	public LineSegment(double x1, double y1, double x2, double y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	// Calculates and returns length
	public double getLength() {
		// returns (squared x + squared y)
		return Math.hypot(x2 - x1, y2 - y1);
	}

	// good string representation
	@Override
	public String toString() {
		return String.format("(%.2f, %.2f) to (%.2f, %.2f)", x1, y1, x2, y2);
	}
}