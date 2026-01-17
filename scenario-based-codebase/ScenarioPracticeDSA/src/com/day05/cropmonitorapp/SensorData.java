package com.day05.cropmonitorapp;

import java.util.ArrayList;

public class SensorData {
	// List of sensor readings
	private ArrayList<SensorReading> readings = new ArrayList<>();

	// method to add reading to list
	public void addReading(SensorReading reading) {
		readings.add(reading);
	}

	// Quick Sort - readings by time
	public void quickSortByTimestamp() {
		quickSort(0, readings.size() - 1);
		System.out.println("Quick Sort completed.");
	}

	// Quick Sort Method
	private void quickSort(int low, int high) {
		if (low < high) {
			// pivot index
			int pi = partition(low, high);

			// Sort left part
			quickSort(low, pi - 1);
			// Sort right part
			quickSort(pi + 1, high);
		}
	}

	// Partition method to return pivot index after placing it at right index
	private int partition(int low, int high) {
		SensorReading pivot = readings.get(high);
		int i = low - 1;

		for (int j = low; j < high; j++) {
			// Compare by time
			if (readings.get(j).getTimestamp().isBefore(pivot.getTimestamp())) {
				i++;
				swap(i, j);
			}
		}

		// Place pivot in correct position
		swap(i + 1, high);
		
		return i + 1;
	}

	// Swap method as helper
	private void swap(int i, int j) {
		SensorReading temp = readings.get(i);
		readings.set(i, readings.get(j));
		readings.set(j, temp);
	}
	
	// Display the readings list
	public void printReadings() {
		System.out.println("Total readings: " + readings.size());
		for (int i = 0; i < readings.size(); i++) {
			System.out.printf("%3d) %s%n", i + 1, readings.get(i));
		}
		System.out.println("----------------------------------------");
	}
}