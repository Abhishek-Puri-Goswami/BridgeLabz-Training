package com.day06.icecreamrushapp;

public class IceCreamFlavor implements Comparable<IceCreamFlavor> {
	private final String name;
	private final int weeklySales;

	// Constructor
	public IceCreamFlavor(String name, int weeklySales) {
		this.name = name.trim();
		this.weeklySales = weeklySales;
	}

	public String getName() {
		return name;
	}

	public int getWeeklySales() {
		return weeklySales;
	}

	// method for ice-creams comparison
	@Override
	public int compareTo(IceCreamFlavor other) {
		return Integer.compare(this.weeklySales, other.weeklySales);
	}

	// good string representation
	@Override
	public String toString() {
		return String.format("%-20s | %4d sales", name, weeklySales);
	}
}