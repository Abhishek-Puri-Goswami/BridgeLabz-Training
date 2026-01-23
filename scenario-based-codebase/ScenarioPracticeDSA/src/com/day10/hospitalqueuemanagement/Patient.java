package com.day10.hospitalqueuemanagement;

// Represents one patient in the queue
public class Patient {
	// unique Id
	private String patientId;
	private String name;
	// format: "YYYY-MM-DD HH:MM"
	private String checkInTime;
	private String department;
	private String condition;

	// constructor
	public Patient(String patientId, String name, String checkInTime, String department, String condition) {
		this.patientId = patientId;
		this.name = name;
		this.checkInTime = checkInTime;
		this.department = department;
		this.condition = condition;
	}

	// good string representation for display
	@Override
	public String toString() {
		return String.format("%-14s | %-18s | %s | %-12s | %s", patientId, name, checkInTime, department, condition);
	}

	public String getPatientId() {
		return patientId;
	}

	public String getCheckInTime() {
		return checkInTime;
	}

	public String getName() {
		return name;
	}
}