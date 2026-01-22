package com.day09.medwarehouse;

public class Medicine {
	private String name;
	private String batchNumber;
	private String expiryDate; // format: "YYYY-MM-DD"
	private String branch;

	// constructor
	public Medicine(String name, String batchNumber, String expiryDate, String branch) {
		this.name = name;
		this.batchNumber = batchNumber;
		this.expiryDate = expiryDate;
		this.branch = branch;
	}

	// good string representation
	public String toString() {
		return String.format("%-22s | %12s | %s | %s", name, batchNumber, expiryDate, branch);
	}

	// method to get expiry date
	public String getExpiryDate() {
		return expiryDate;
	}

	// method to check if medicine is nearing expiry
	public boolean isNearingExpiry() {
		return getExpiryDate().compareTo("2026-04-21") <= 0;
	}
}