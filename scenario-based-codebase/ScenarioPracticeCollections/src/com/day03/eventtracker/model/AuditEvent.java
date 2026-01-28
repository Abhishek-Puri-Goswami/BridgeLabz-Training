package com.day03.eventtracker.model;

// model for audit log
public class AuditEvent {

	private String className;
	private String methodName;
	private String action;
	@SuppressWarnings("unused")
	private String description;
	private String timestamp;

	// constructor
	public AuditEvent(String className, String methodName, String action, String description, String timestamp) {
		this.className = className;
		this.methodName = methodName;
		this.action = action;
		this.description = description;
		this.timestamp = timestamp;
	}

	// good string representation
	@Override
	public String toString() {
		return className + "." + methodName + " [" + action + "] @ " + timestamp;
	}
}
