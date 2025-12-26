package com.classandobject.levelone;

public class Circle {

	// non-static variable
	double radius;

	// constructor
	Circle(double radius) {
		this.radius = radius;
	}

	// creating method for calculating area of circle
	public void areaCircle() {
		System.out.printf("Area of circle: %.4f%n", Math.PI * radius * radius);
	}

	// creating method for calculating circumference of circle
	public void circumferenceCircle() {
		System.out.printf("Circumference of circle: %.4f%n", 2 * Math.PI * radius);
	}

	public static void main(String[] args) {

		// constructor invocation
		Circle circle = new Circle(2.5);

		// area method calling
		circle.areaCircle();

		// circumference method calling
		circle.circumferenceCircle();
	}
}
