package com.day03.eventtracker.service;

import com.day03.eventtracker.annotation.AuditTrail;

public class UserService {

	@AuditTrail(action = "LOGIN", description = "User logged into system")
	public void login() {
		System.out.println("Login complete.");
	}

	@AuditTrail(action = "UPLOAD", description = "User uploaded file")
	public void uploadFile() {
		System.out.println("File upload complete.");
	}

	public void viewProfile() {
		System.out.println("Profile display complete.");
	}

	@AuditTrail(action = "DELETE", description = "User deleted file")
	public void deleteFile() {
		System.out.println("File deletion complete.");
	}
}
