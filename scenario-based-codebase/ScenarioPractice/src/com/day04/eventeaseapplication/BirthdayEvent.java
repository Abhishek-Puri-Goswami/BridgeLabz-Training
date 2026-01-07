package com.day04.eventeaseapplication;

public class BirthdayEvent extends Event {

	// constructor
	public BirthdayEvent(int eventId, String name, String location, String date, int attendees, boolean catering) {
		super(eventId, name, location, date, attendees);
		
		double venueCost = 20000;
		double serviceCost = catering ? 10000 : 0;
		double discount = 2000;

		setCost(venueCost, serviceCost, discount);
	}

	@Override
	public void schedule() {
		System.out.println("Birthday event scheduled with party arrangements.");
	}

	@Override
	public void reschedule(String newDate) {
		this.date = newDate;
		System.out.println("Birthday event rescheduled.");
	}

	@Override
	public void cancel() {
		System.out.println("Birthday event cancelled.");
	}
}
