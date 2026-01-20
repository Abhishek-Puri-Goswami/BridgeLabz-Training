package com.day08.foodfest;

public class StallFootfall {
	private String stallName;
	private int footfallCount;
	private String zone;

	// constructor
	public StallFootfall(String stallName, int footfallCount, String zone) {
		this.stallName = stallName;
		this.footfallCount = footfallCount;
		this.zone = zone;
	}

	// good string representation
	public String toString() {
		return String.format("%-22s | %7d  | %-10s", stallName, footfallCount, zone);
	}

	// method to get footfall count
	public int getFootfallCount() {
		return footfallCount;
	}

	// method to get stall name
	public String getStallName() {
		return stallName;
	}
}