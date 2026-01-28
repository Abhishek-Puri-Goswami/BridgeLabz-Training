package com.day03.eventtracker;

import com.day03.eventtracker.annotation.AuditTrail;
import com.day03.eventtracker.model.AuditEvent;

import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class EventTracker {
    private List<AuditEvent> events = new ArrayList<>();

    // scans service class
    public void scanClass(Class<?> clazz) {
        String className = clazz.getSimpleName();

        for (Method method : clazz.getDeclaredMethods()) {
            AuditTrail audit = method.getAnnotation(AuditTrail.class);

            if (audit != null) {
                String timestamp = LocalDateTime.now().toString();
                AuditEvent event =
                        new AuditEvent(
                                className,
                                method.getName(),
                                audit.action(),
                                audit.description(),
                                timestamp
                        );

                events.add(event);
            }
        }
    }

    // returns collected events
    public List<AuditEvent> getEvents() {
		return events;
	}
}
