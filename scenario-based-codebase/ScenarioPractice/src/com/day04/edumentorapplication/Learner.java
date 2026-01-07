package com.day04.edumentorapplication;

public class Learner extends User implements ICertifiable {

    private String courseType; // Short or Full

    public Learner(int userId, String name, String email, String courseType) {
        super(userId, name, email);
        this.courseType = courseType;
    }

    // Generates certificate based on course type and score
    @Override
    public void generateCertificate(double percentage) {

        System.out.println("\n------ Certificate ------");
        System.out.printf("%-20s : %s%n", "Learner Name", name);
        System.out.printf("%-20s : %.2f%%%n", "Score", percentage);

        if (courseType.equalsIgnoreCase("Short") && percentage >= 60) {
            System.out.println("Status               : Certified (Short Course)");
        } else if (courseType.equalsIgnoreCase("Full") && percentage >= 75) {
            System.out.println("Status               : Certified (Full-Time Course)");
        } else {
            System.out.println("Status               : Not Certified");
        }
    }

    // method to display Learner's Details
    @Override
    protected void printDetails() {
        System.out.println("\n------ Learner Details ------");
        System.out.printf("%-15s : %d%n", "User ID", userId);
        System.out.printf("%-15s : %s%n", "Name", name);
        System.out.printf("%-15s : %s%n", "Email", email);
        System.out.printf("%-15s : %s%n", "Course Type", courseType);
    }
}
