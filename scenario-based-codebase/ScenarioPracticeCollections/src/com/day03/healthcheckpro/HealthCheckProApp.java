package com.day03.healthcheckpro;

import com.day03.healthcheckpro.controller.PatientController;
import com.day03.healthcheckpro.controller.LabReportController;

public class HealthCheckProApp {
	public static void main(String[] args) {
		HealthCheckPro checker = new HealthCheckPro();

		checker.scanController(PatientController.class);
		checker.scanController(LabReportController.class);

		checker.printWarnings();
		checker.printDocumentation();
	}
}
