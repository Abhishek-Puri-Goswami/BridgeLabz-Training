/*
2. AVL Tree
Story: Online Ticket Booking by Time
	Users book event tickets sorted by event time.
Scenarios:
	● 🔹 Scenario 1: Insert Event — Add new event based on start time.
	● 🔹 Scenario 2: Cancel Event — Admin deletes a cancelled event.
	● 🔹 Scenario 3: Show Events in Order — Display events in upcoming order.
*/

package com.day10.onlineticketbooking;

public class TicketBookingApp {
    public static void main(String[] args) {
        EventAVLTree bookingSystem = new EventAVLTree();

        System.out.println("===========================================================================================");
        System.out.println("                    ONLINE EVENT TICKET BOOKING SYSTEM (AVL)");
        System.out.println("===========================================================================================");

        // Scenario 1: Add new events
        bookingSystem.addEvent(new Event("EVT-20260125-001", "Coldplay Concert",     "2026-02-14 19:30", "Bhopal Arena",     2500));
        bookingSystem.addEvent(new Event("EVT-20260201-002", "Tech Summit 2026",     "2026-03-05 09:00", "Indore Convention", 800));
        bookingSystem.addEvent(new Event("EVT-20260120-003", "Comedy Night",         "2026-01-30 20:00", "Jabalpur Cultural", 400));
        bookingSystem.addEvent(new Event("EVT-20260210-004", "Bollywood Night",      "2026-02-20 18:00", "Raipur Stadium",   3500));
        bookingSystem.addEvent(new Event("EVT-20260128-005", "Stand-up Special",     "2026-02-02 19:00", "Bhopal Theatre",   600));

        System.out.println("All upcoming events (chronological order):");
        bookingSystem.showUpcomingEvents();

        // Scenario 2: Cancel an event
        System.out.println("\nCancelling event EVT-20260120-003 (Comedy Night cancelled)");
        bookingSystem.cancelEvent("EVT-20260120-003");

        System.out.println("\nUpdated upcoming events:");
        bookingSystem.showUpcomingEvents();

        System.out.println("\nTotal active events: " + bookingSystem.getEventCount());
        System.out.println("===========================================================================================");
    }
}