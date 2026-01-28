package com.day03.eventtracker;

import com.day03.eventtracker.model.AuditEvent;
import com.day03.eventtracker.service.UserService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.util.List;

public class EventTrackerApp {
	public static void main(String[] args) {
		EventTracker tracker = new EventTracker();
		tracker.scanClass(UserService.class);
		List<AuditEvent> events = tracker.getEvents();

		try {
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			FileWriter writer = new FileWriter("samplefiles/eventtracker/audit_log.json");
			gson.toJson(events, writer);

			writer.flush();
			writer.close();
			System.out.println("Audit log generated successfully.");
			
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
