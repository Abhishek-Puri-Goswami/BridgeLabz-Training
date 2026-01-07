package com.day04.eventeaseapplication;

public class ConferenceEvent extends Event {

	// constructor
	public ConferenceEvent(int eventId, String name, String location, String date, int attendees, boolean decoration) {
		super(eventId, name, location, date, attendees);

		double venueCost = 50000;
		double serviceCost = decoration ? 20000 : 0;
		double discount = attendees > 100 ? 5000 : 0;

		setCost(venueCost, serviceCost, discount);
	}

	@Override
	public void schedule() {
		System.out.println("Conference scheduled with professional setup.");
	}

	@Override
	public void reschedule(String newDate) {
		this.date = newDate;
		System.out.println("Conference rescheduled.");
	}

	@Override
	public void cancel() {
		System.out.println("Conference cancelled.");
	}
}
