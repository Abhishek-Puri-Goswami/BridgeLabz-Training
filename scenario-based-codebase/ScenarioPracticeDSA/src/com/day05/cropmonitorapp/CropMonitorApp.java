/*
8. CropMonitor – Sensor Data Ordering (Quick Sort)
Story: 
	● An agri-tech firm uses drone sensors that record soil temperatures at random intervals.
	● The large data needs to be sorted quickly by timestamp before visualization. 
	● Quick Sort is chosen due to its fast average performance.
Key Concepts:
	● Unordered sensor data
	● High-speed sorting
	● Quick partitioning based on timestamps
*/

package com.day05.cropmonitorapp;

import java.time.LocalDateTime;

public class CropMonitorApp {
	public static void main(String[] args) {
		System.out.println("================= CropMonitor ================\n");

		SensorData data = new SensorData();

		// Added example sensor readings at random timestamps
		data.addReading(new SensorReading("S01", LocalDateTime.of(2025, 3, 14, 8, 42, 15), 22.4));
		data.addReading(new SensorReading("S03", LocalDateTime.of(2025, 3, 14, 9, 15, 0), 23.1));
		data.addReading(new SensorReading("S02", LocalDateTime.of(2025, 3, 14, 7, 10, 33), 21.8));
		data.addReading(new SensorReading("S04", LocalDateTime.of(2025, 3, 14, 11, 5, 22), 24.0));
		data.addReading(new SensorReading("S01", LocalDateTime.of(2025, 3, 14, 8, 59, 47), 22.7));
		data.addReading(new SensorReading("S05", LocalDateTime.of(2025, 3, 14, 6, 55, 10), 20.9));
		data.addReading(new SensorReading("S03", LocalDateTime.of(2025, 3, 14, 10, 30, 5), 23.6));

		System.out.println("Before sorting:");
		data.printReadings();

		System.out.println("\nSorting by timestamp...");
		data.quickSortByTimestamp();

		System.out.println("\nAfter Quick Sort:");
		data.printReadings();

		System.out.println("============ Ready for visualization ============");
	}
}