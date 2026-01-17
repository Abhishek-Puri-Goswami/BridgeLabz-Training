package com.day05.robowarehouseapp;

public class Package {
	private String id;
    private double weight;
    
    // constructor
    public Package(String id, double weight) {
    	this.id = id;
    	this.weight = weight;
    }

	public String getId() {
		return id;
	}

	public double getWeight() {
		return weight;
	}
	
	// Good string representation
	@Override
	public String toString() {
        return id + " (" + weight + " kg)";
    }
}
