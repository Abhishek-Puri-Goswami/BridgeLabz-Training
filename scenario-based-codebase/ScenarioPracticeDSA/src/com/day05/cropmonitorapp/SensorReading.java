package com.day05.cropmonitorapp;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SensorReading {
	LocalDateTime timestamp;
	double soilTemperature; // in degree Celsius
	String sensorId;

	// constructor
	public SensorReading(String sensorId, LocalDateTime timestamp, double temperature) {
		this.sensorId = sensorId;
		this.timestamp = timestamp;
		this.soilTemperature = temperature;
	}

	// Good string representation
	@Override
	public String toString() {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		return String.format("%s | %s | %.1f degree Celsius", sensorId, timestamp.format(fmt), soilTemperature);
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}
}
