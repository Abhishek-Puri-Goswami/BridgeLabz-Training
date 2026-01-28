package com.day03.healthcheckpro.controller;

import com.day03.healthcheckpro.annotation.PublicAPI;
import com.day03.healthcheckpro.annotation.RequiresAuth;

public class PatientController {

    @PublicAPI(description = "Get available lab tests")
    public void getLabTests() {
        System.out.println("Lab tests returned.");
    }

    @RequiresAuth(role = "PATIENT", description = "Book lab slot")
    public void bookLabTest() {
    	System.out.println("Lab tests booked.");
    }

    // missing annotation
    public void cancelAppointment() {
    	System.out.println("Appointment cancelled.");
    }

    @RequiresAuth(role = "DOCTOR", description = "View lab results")
    public void viewResults() {
    	System.out.println("Results display complete.");
    }
}
