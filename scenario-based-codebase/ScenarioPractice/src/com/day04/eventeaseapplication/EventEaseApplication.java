/*
13. "EventEase – Event Management Platform"
Story: EventEase helps users organize events like birthdays, weddings, and conferences.
You’re responsible for the booking and scheduling module.
Requirements:
● Event class: eventName, location, date, attendees.
● User class to represent the organizer.

Scenario-based Problems
● Constructors to create events with or without catering/decoration packages.
● ISchedulable interface with methods schedule(), reschedule(), cancel().
● Use access modifiers to restrict editing of eventId once assigned.
● Use operators to calculate costs (venue + services – discounts).
● Inheritance: BirthdayEvent, ConferenceEvent extend Event.
● Polymorphism: schedule() behaves differently based on event type.
● Apply encapsulation to protect pricing and sensitive user data.
*/

package com.day04.eventeaseapplication;

import java.util.Scanner;

public class EventEaseApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Organizer input
        System.out.print("Enter Organizer Name: ");
        String uname = input.nextLine();

        System.out.print("Enter Organizer Email: ");
        String email = input.nextLine();

        User user = new User(uname, email);

        // Event input
        System.out.print("\nEnter Event ID: ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Enter Event Name: ");
        String name = input.nextLine();

        System.out.print("Enter Location: ");
        String location = input.nextLine();

        System.out.print("Enter Date (dd-mm-yyyy): ");
        String date = input.nextLine();

        System.out.print("Enter Number of Attendees: ");
        int attendees = input.nextInt();

        System.out.println("\nSelect Event Type:");
        System.out.println("1. Birthday");
        System.out.println("2. Conference");
        System.out.print("Choice: ");
        int type = input.nextInt();

        Event event;

        if (type == 1) {
            System.out.print("Include Catering? (true/false): ");
            boolean catering = input.nextBoolean();
            event = new BirthdayEvent(id, name, location, date, attendees, catering);
        } else {
            System.out.print("Include Decoration? (true/false): ");
            boolean decoration = input.nextBoolean();
            event = new ConferenceEvent(id, name, location, date, attendees, decoration);
        }

        // Schedule event
        event.schedule();

        // Display the results
        System.out.println("\n--- Organizer Details ---");
        user.printDetails();

        System.out.println("\n--- Event Summary ---");
        System.out.printf("%-12s %-15s %-12s %-12s %-10s %-12s%n",
                "Event ID", "Name", "Location", "Date", "Attendees", "Total Cost");
        event.printEvent();
        input.close();
    }
}
