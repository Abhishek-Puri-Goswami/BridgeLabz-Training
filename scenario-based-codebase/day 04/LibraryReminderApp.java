/**
 * 15. Rohan’s Library Reminder App
 *      Rohan wants a fine calculator.
 *      Input return date and due date.
 *      If returned late, calculate fine: Rs.5/day.
 *      Repeat for 5 books using for-loop.
 */

import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;

public class LibraryReminderApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        final int TOTAL_BOOKS = 5;
        final int FINE_PER_DAY = 5;
        int totalFine = 0;

        System.out.println("=================================================");
        System.out.println("         ROHAN'S LIBRARY REMINDER APP");
        System.out.println("=================================================");
        System.out.println("Fine Rule: Rs.5 per day after due date");

        // Loop for 5 books
        for (int i = 1; i <= TOTAL_BOOKS; i++) {
            System.out.println("-------------------------------------------------");
            System.out.printf("Book %d%n", i);
            System.out.print("-> Enter due date (dd-MM-yyyy)    : ");
            LocalDate dueDate = LocalDate.parse(input.next(), formatter);

            System.out.print("-> Enter return date (dd-MM-yyyy) : ");
            LocalDate returnDate = LocalDate.parse(input.next(), formatter);

            // Calculate late days
            long lateDays = ChronoUnit.DAYS.between(dueDate, returnDate);

            System.out.println("-------------------------------------------------");
            int fine = 0;
            if (lateDays > 0) {
                fine = (int) lateDays * FINE_PER_DAY;
                totalFine += fine;

                System.out.printf(" %-20s |   %-20s%n", "Status", "Returned Late");
                System.out.printf(" %-20s |   %-20d%n", "Late Days", lateDays);
                System.out.printf(" %-20s |   Rs.%-20d%n", "Fine Charged", fine);
            } else {
                System.out.printf(" %-20s |   %-20s%n", "Status", "Returned On Time");
                System.out.printf(" %-20s |   Rs.%-20d%n", "Fine Charged", fine);
            }
        }
        System.out.println("=================================================");
        System.out.printf(" %-20s |   Rs.%-20d%n", "Total Fine Amount", totalFine);
        System.out.println("=================================================");
        input.close();
    }
}
