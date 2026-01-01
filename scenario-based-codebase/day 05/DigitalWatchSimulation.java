
/**
 * 16. Digital Watch Simulation
 * Simulate a 24-hour watch:
 * Print hours and minutes in a nested for-loop.
 * Use a break to stop at 13:00 manually (simulate power cut).
 * ore Java Scenario Based Problem Statements
 */

public class DigitalWatchSimulation {
    public static void main(String[] args) {
        // Loop for 24-hour format (0 to 23)
        for (int hour = 0; hour < 24; hour++) {
            // Loop for minutes (0 to 59)
            for (int minute = 0; minute < 60; minute++) {
                // Simulating power cut at 13:00
                if (hour == 13 && minute == 0) {
                    System.out.println("Power cut occurred at 13:00. Watch stopped.");
                    break;
                }
                // Displaying time in HH:MM format
                System.out.printf("%02d:%02d%n", hour, minute);
            }
            // Exiting outer loop after power cut
            if (hour == 13) {
                break;
            }
        }
    }
}
