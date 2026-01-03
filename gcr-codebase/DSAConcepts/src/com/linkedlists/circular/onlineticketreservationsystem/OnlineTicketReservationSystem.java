package com.linkedlists.circular.onlineticketreservationsystem;

public class OnlineTicketReservationSystem {

	public static void main(String[] args) {

		TicketCircularLinkedList tickets = new TicketCircularLinkedList();

		tickets.addTicket(1, "Abhishek Puri Goswami", "Dangal", "A10", "10:30 AM");
		tickets.addTicket(2, "Divyansh Pandey", "Sultan", "B05", "11:00 AM");
		tickets.addTicket(3, "Akshat Jain", "Lagaan", "A11", "11:15 AM");

		System.out.println("All Tickets:");
		tickets.displayTickets();

		System.out.println("Search by Movie Name (Dangal):");
		tickets.searchTicket("Dangal");

		System.out.println("Remove Ticket ID 2:");
		tickets.removeTicket(2);

		System.out.println("---------------------------");
		System.out.println("Updated Tickets:");
		tickets.displayTickets();

		System.out.println("Total Tickets Booked: " + tickets.getTotalTickets());
	}
}
