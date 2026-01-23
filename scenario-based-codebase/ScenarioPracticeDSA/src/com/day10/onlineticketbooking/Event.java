package com.day10.onlineticketbooking;

// Represents one event/ticket booking entry
public class Event {
	// unique key
	private String eventId;
	private String name;
	private String startTime; // format: "YYYY-MM-DD HH:MM" (24-hour)
	private String venue;
	private int availableTickets;

	// constructor
	public Event(String eventId, String name, String startTime, String venue, int availableTickets) {
		this.eventId = eventId;
		this.name = name;
		this.startTime = startTime;
		this.venue = venue;
		this.availableTickets = availableTickets;
	}

	// good string representation for display
	@Override
	public String toString() {
		return String.format("%-16s | %-20s | %s | %-17s | %4d left", eventId, name, startTime, venue,
				availableTickets);
	}

	public String getEventId() {
		return eventId;
	}

	public String getStartTime() {
		return startTime;
	}

	public String getName() {
		return name;
	}
}