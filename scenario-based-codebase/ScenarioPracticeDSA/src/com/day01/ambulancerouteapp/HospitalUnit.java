package com.day01.ambulancerouteapp;

public class HospitalUnit {
	String name;
	boolean isAvailable;
	HospitalUnit next;

	// constructor
	public HospitalUnit(String name, boolean isAvailable) {
		this.name = name;
		this.isAvailable = isAvailable;
		this.next = null;
	}

	public String getStatus() {
		return isAvailable ? "Available" : "Busy";
	}
}