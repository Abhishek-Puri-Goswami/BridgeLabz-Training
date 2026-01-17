/*
 1. IceCreamRush – Sorting Flavors by Popularity (Bubble Sort)
Story: 
	● At “IceCreamRush,” a small local vendor sells 8 different ice cream flavors. 
	● At the end of each week, the shopkeeper wants to sort these flavors based on how many times each was sold. 
	● Since the list is short and he updates it manually, he prefers a simple sorting method —
	● Bubble Sort — where he repeatedly compares adjacent sales figures and swaps them if Needed.
Concepts Involved:
	● Bubble Sort
	● Small data size
	● Repeated adjacent comparisons
*/

package com.day06.icecreamrushapp;

public class IceCreamRushApp {
    public static void main(String[] args) {
        System.out.println("================ IceCreamRush ====================\n");

        // Added example ice creams
        // 8 flavors with unsorted weekly sales data
        IceCreamFlavor[] flavors = {
            new IceCreamFlavor("Strawberry",    100),
            new IceCreamFlavor("Paan",          45),
            new IceCreamFlavor("Vanilla",       150),
            new IceCreamFlavor("Kulfi",         90),
            new IceCreamFlavor("Chocolate",     140),
            new IceCreamFlavor("Butterscotch",  80),
            new IceCreamFlavor("Mango",         120),
            new IceCreamFlavor("Pistachio",     60)
        };

        // Print initial unsorted data
        BubbleSort.printPopularity(flavors, "Unsorted Weekly Sales");

        // Bubble Sort (DESC by sales)
        BubbleSort.bubbleSort(flavors);

        // Print final ranked popularity
        BubbleSort.printPopularity(flavors, "Popularity Ranking (Most Popular First)");
        System.out.println("============== Thanks for using ==============\n");
    }
}