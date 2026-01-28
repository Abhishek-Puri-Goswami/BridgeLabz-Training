package com.day03.healthcheckpro.controller;

import com.day03.healthcheckpro.annotation.PublicAPI;
import com.day03.healthcheckpro.annotation.RequiresAuth;

public class LabReportController {

	@PublicAPI(description = "Check report status")
	public void checkStatus() {
		System.out.println("Status check complete.");
	}

	@RequiresAuth(role = "LAB_TECH", description = "Upload report")
	public void uploadReport() {
		System.out.println("Report upload complete.");
	}

	// missing annotation
	public void deleteOldReport() {
		System.out.println("Report deletion complete.");
	}
}
