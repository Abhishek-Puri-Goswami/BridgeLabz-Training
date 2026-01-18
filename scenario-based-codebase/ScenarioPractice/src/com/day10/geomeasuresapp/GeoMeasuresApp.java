/*
	You're working at GeoMeasure Solutions, a company that builds custom software for civil
	engineers and architects. One of their core requirements is to compare line segments on
	blueprints to determine if they are of equal length, or which one is longer.
	 Problem Statement:
	Build a Java application that:
	● Allows a user to input the coordinates (x1, y1, x2, y2) of two lines.
	● Uses a method to calculate the length of each line.
	● Compares the two lengths and prints whether they are equal, or which is longer.
	● Uses encapsulation to hide the internal data of each line.
	● Uses constructors to initialize line objects.
	Bonus: Support multiple line comparisons and store them in a list.
*/

package com.day10.geomeasuresapp;

import java.util.Scanner;

public class GeoMeasuresApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("===== GeoMeasure Solutions - Line Segment Length Comparator =====");

		// Input first line segment
		System.out.print("Enter coordinates for Line Segment 1 (x1 y1 x2 y2): ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();

		LineSegment seg1 = new LineSegment(x1, y1, x2, y2);

		// Input second line segment
		System.out.print("Enter coordinates for Line Segment 2 (x1 y1 x2 y2): ");
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		x2 = input.nextDouble();
		y2 = input.nextDouble();

		LineSegment seg2 = new LineSegment(x1, y1, x2, y2);

		// Display both line segments
		System.out.println("\n--- Comparison ---");
		System.out.printf("Segment 1: %s  Length: %.4f%n", seg1.toString(), seg1.getLength());
		System.out.printf("Segment 2: %s  Length: %.4f%n", seg2.toString(), seg2.getLength());

		double len1 = seg1.getLength();
		double len2 = seg2.getLength();

		if (Math.abs(len1 - len2) < 1e-6) {
			System.out.println("The two line segments are equal in length.");
		} else if (len1 > len2) {
			System.out.println("Segment 1 is longer.");
		} else {
			System.out.println("Segment 2 is longer.");
		}
		input.close();
	}
}