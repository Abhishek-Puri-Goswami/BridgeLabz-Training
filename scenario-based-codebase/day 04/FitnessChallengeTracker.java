
/**
* 13. Sandeep’s Fitness Challenge Tracker
*     Each day Sandeep completes a number of push-ups.
*     Store counts for a week.
*     Use for-each to calculate total and average.
*     Use continue to skip rest days.
*/

import java.util.Scanner;
public class FitnessChallengeTracker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int DAYS = 7;
        int[] pushUps = new int[DAYS];
        int totalPushUps = 0;
        int activeDays = 0;

        System.out.println("===========================================");
        System.out.println("    SANDEEP'S FITNESS CHALLENGE TRACKER");
        System.out.println("===========================================");
        System.out.println("Enter push-ups completed each day");
        System.out.println("(Enter 0 for rest day)");
        System.out.println("-------------------------------------------");

        // Store push-ups for 7 days
        for (int i = 0; i < DAYS; i++) {
            System.out.printf(" Day %-3d push-ups   |          ", i + 1);
            pushUps[i] = input.nextInt();
        }

        // Calculate total and average using for-each
        for (int count : pushUps) {
            if (count == 0) {
                continue; // skip rest days
            }
            totalPushUps += count;
            activeDays++;
        }

        double average = (activeDays != 0) ? (double) totalPushUps / activeDays : 0;

        // Display results
        System.out.println("\n-------------------------------------------");
        System.out.printf("%-20s| %10d%n", "Total Push-ups", totalPushUps);
        System.out.printf("%-20s| %10d%n", "Active Days", activeDays);
        System.out.printf("%-20s| %10.2f%n", "Average Push-ups", average);
        System.out.println("-------------------------------------------");
        input.close();
    }
}
