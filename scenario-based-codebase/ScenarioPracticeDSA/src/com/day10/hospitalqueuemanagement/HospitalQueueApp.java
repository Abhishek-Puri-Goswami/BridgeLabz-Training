/*
2. AVL Tree
Story: Hospital Queue Management
	Patients are sorted by check-in time and balanced for quick lookups.
Scenarios:
	● 🔹 Scenario 1: Patient Registration
	● 🔹 Scenario 2: Discharge/Delete Record
	● 🔹 Scenario 3: Display by Arrival Time
*/

package com.day10.hospitalqueuemanagement;

public class HospitalQueueApp {
	public static void main(String[] args) {
		HospitalQueueAVL queue = new HospitalQueueAVL();

		System.out.println("=====================================================================================");
		System.out.println("                         HOSPITAL QUEUE MANAGEMENT (AVL)");
		System.out.println("=====================================================================================\n");

		// Scenario 1: Patient Registration
		queue.registerPatient(
				new Patient("P20260123-001", "Amit Sharma", "2026-01-23 08:15", "General Medicine", "Fever & Cough"));
		queue.registerPatient(
				new Patient("P20260123-002", "Priya Patel", "2026-01-23 08:40", "Orthopedics", "Knee Pain"));
		queue.registerPatient(
				new Patient("P20260123-003", "Rahul Verma", "2026-01-23 07:55", "Pediatrics", "Child Fever"));
		queue.registerPatient(new Patient("P20260123-004", "Sneha Gupta", "2026-01-23 09:10", "ENT", "Ear Infection"));
		queue.registerPatient(
				new Patient("P20260123-005", "Vikram Singh", "2026-01-23 08:50", "General Medicine", "Stomach Ache"));

		System.out.println("Current Waiting Queue (by arrival time):");
		queue.displayQueue();

		// Scenario 2: Discharge / remove patient
		System.out.println("\nPatient P20260123-003 (Rahul Verma) discharged / seen");
		queue.dischargePatient("P20260123-003");

		System.out.println("\nUpdated Queue:");
		queue.displayQueue();

		System.out.println("\nNew patient arrives:");
		queue.registerPatient(
				new Patient("P20260123-006", "Neha Jain", "2026-01-23 09:25", "Dermatology", "Skin Rash"));

		System.out.println("\nFinal Queue:");
		queue.displayQueue();
		System.out.println("=====================================================================================");
	}
}