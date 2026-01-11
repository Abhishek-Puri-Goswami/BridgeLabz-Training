/**
3. AmbulanceRoute – Emergency Patient Navigation (Circular Linked List)
Story: 
	● In a hospital, there are multiple buildings connected in a circular fashion:
	● Emergency → Radiology → Surgery → ICU → Emergency. 
	● When an ambulance is bringing in patients, it follows a Circular Linked List to decide the nearest available unit for emergency treatment.
Requirements:
	● Each node represents a hospital unit.
	● Rotate through units until an available one is found.
	● Simulate patient redirection in a circular path.
	● Remove a unit if it's under maintenance.
*/

package com.day01.ambulancerouteapp;

public class AmbulanceRoute {
	public static void main(String[] args) {
		HospitalCircularRoute route = new HospitalCircularRoute();

		// Setup hospital units (circular: Emergency → Radiology → Surgery → ICU →
		// Emergency)
		route.addUnit("Emergency", true);
		route.addUnit("Radiology", false);
		route.addUnit("Surgery", true);
		route.addUnit("ICU", true);

		System.out.println("===== Initial Hospital Status =====");
		route.printStatus();

		// Simulate incoming ambulances
		System.out.println("Ambulance 1 arrives...");
		HospitalUnit assigned1 = route.findNextAvailableUnit();
		printAssignment(assigned1);

		System.out.println("Ambulance 2 arrives...");
		HospitalUnit assigned2 = route.findNextAvailableUnit();
		printAssignment(assigned2);

		// Simulate maintenance
		System.out.println("\nSurgery is under maintenance!");
		boolean success = route.setUnderMaintenance("Surgery");
		System.out.println(success ? "Maintenance started." : "Unit not found!");

		route.printStatus();

		// More ambulances arrive
		System.out.println("Ambulance 3 arrives...");
		HospitalUnit assigned3 = route.findNextAvailableUnit();
		printAssignment(assigned3);

		System.out.println("Ambulance 4 arrives...");
		HospitalUnit assigned4 = route.findNextAvailableUnit();
		printAssignment(assigned4);

		// Surgery back to service
		System.out.println("\nSurgery maintenance completed!");
		route.restoreUnit("Surgery");
		route.printStatus();
	}

	private static void printAssignment(HospitalUnit unit) {
		if (unit == null) {
			System.out.println("=> No available unit found! Critical situation!");
		} else {
			System.out.println("=> Patient directed to: " + unit.name + " (" + unit.getStatus() + ")");
		}
		System.out.println();
	}
}