/*
 7. FoodFest – Sorting Stalls by Customer Footfall (Merge Sort)
Story: 
	● At a multi-day food festival, organizers track footfall at every stall each day. 
	● They collect daily logs from all zones (already sorted by count), and use Merge Sort 
	  to combine zone-wise data into a master list for performance evaluation.
Concepts Involved:
	● Merge Sort
	● Combining multiple sorted datasets
	● Stability in data with equal values
*/
package com.day08.foodfest;

public class FoodFestApp {
	public static void main(String[] args) {
		FoodFestManager manager = new FoodFestManager();

		// Zone A - already sorted by footfall (descending)
		StallFootfall[] zoneA = { new StallFootfall("Biryani House", 1240, "A"),
				new StallFootfall("Pizza Point", 980, "A"), new StallFootfall("Chaat Corner", 750, "A"),
				new StallFootfall("Dosa Hub", 620, "A") };

		// Zone B - already sorted
		StallFootfall[] zoneB = { new StallFootfall("Momos Kingdom", 1450, "B"),
				new StallFootfall("Burger Barn", 1120, "B"), new StallFootfall("Pav Bhaji Stall", 890, "B"),
				new StallFootfall("Ice Cream Zone", 680, "B") };

		// Zone C - already sorted
		StallFootfall[] zoneC = { new StallFootfall("Shawarma Hub", 1310, "C"),
				new StallFootfall("Tacos Fiesta", 860, "C"), new StallFootfall("Pani Puri Express", 710, "C") };

		System.out.println("Merging daily footfall data from 3 zones...");

		// merge zone A and B
		StallFootfall[] mergedAB = manager.merge(zoneA, zoneB);

		// merge result with zone C
		StallFootfall[] allStalls = manager.merge(mergedAB, zoneC);
		System.out.println("\nTop performing stalls today:");
		manager.printTopStalls(allStalls);
	}
}