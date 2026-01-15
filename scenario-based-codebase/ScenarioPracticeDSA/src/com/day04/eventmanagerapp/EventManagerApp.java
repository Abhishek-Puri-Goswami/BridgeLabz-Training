/*
4. EventManager – Ticket Price Optimizer (Quick Sort)
Story: 
	● An event booking portal sorts millions of tickets by price before 
	  showing the top 50 cheapest or most expensive. 
	● Since speed is crucial and data is unsorted, Quick Sort is used for its average-case performance.
Key Concepts:
	● Fast average time
	● Recursive partitioning
	● Ideal for large, random datasets
*/

package com.day04.eventmanagerapp;

import java.util.Arrays;

public class EventManagerApp {
 public static void main(String[] args) {
     EventTicketManager manager = new EventTicketManager();

     System.out.println("============== EventManager – Ticket Price Optimizer (Quick Sort) ==============");
     System.out.println("Sorting large ticket inventory for IPL Final 2026\n");

     // Added some tickets
     manager.addAll(Arrays.asList(
         new Ticket("IPL Final 2026", "VIP Box",      45000, 101, true),
         new Ticket("IPL Final 2026", "Platinum",     25000, 205, true),
         new Ticket("IPL Final 2026", "Gold",         12000, 310, false),
         new Ticket("IPL Final 2026", "Silver",        6500, 415, true),
         new Ticket("IPL Final 2026", "Economy",       2800, 520, true),
         new Ticket("IPL Final 2026", "VIP Box",      48000, 102, true),
         new Ticket("IPL Final 2026", "Platinum",     23000, 206, true),
         new Ticket("IPL Final 2026", "Gold",         11500, 311, true),
         new Ticket("IPL Final 2026", "Economy",       3000, 521, false),
         new Ticket("IPL Final 2026", "Silver",        7000, 416, true)
     ));

     // Show unsorted tickets
     System.out.println("Sample of unsorted tickets (arrival order):");
     manager.displayTopTickets("Unsorted Preview (first 10)", 10, true);

     System.out.println("Sorting all tickets with Quick Sort...");

     // Sort ascending (cheapest first)
     manager.sortByPrice(true);

     // Show results
     manager.displayTopTickets("Top 10 Cheapest Available Tickets", 10, true);
     manager.displayTopTickets("Top 10 Most Expensive Tickets", 10, false);

     System.out.println("Total tickets in inventory : " + manager.getTicketCount());
     System.out.println("Approximate comparisons made: " + manager.getComparisonCount());
     System.out.println("Tickets ready for user display");
 }
}