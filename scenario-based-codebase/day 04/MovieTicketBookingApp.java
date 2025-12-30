/**
 * 14. Movie Ticket Booking App
 *      Ask users for movie type, seat type (gold/silver), and snacks.
 *      Use switch and if together.
 *      Loop through multiple customers.
 *      Clean structure and helpful variable names.
*/
import java.util.Scanner;
public class MovieTicketBookingApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=================================================");
        System.out.println("           MOVIE TICKET BOOKING APP");
        System.out.println("=================================================");

        char continueChoice = 'Y';
        // Loop through multiple customers
        do {
            double ticketPrice = 0;
            double snackPrice = 0;

            System.out.println("Select Movie Type:");
            System.out.println("1. Action");
            System.out.println("2. Comedy");
            System.out.println("3. Drama");
            System.out.print("-> Enter choice (1-3): ");
            int movieChoice = input.nextInt();

            // 'switch' for movie type pricing
            switch (movieChoice) {
                case 1:
                    ticketPrice = 200;
                    break;
                case 2:
                    ticketPrice = 180;
                    break;
                case 3:
                    ticketPrice = 150;
                    break;
                default:
                    System.out.println("-> Invalid movie choice.");
                    continue;
            }

            System.out.println("-------------------------------------------------");
            System.out.println("Select Seat Type:");
            System.out.println("1. Gold");
            System.out.println("2. Silver");
            System.out.print("-> Enter choice (1-2): ");
            int seatChoice = input.nextInt();

            // 'if' for seat type pricing
            if (seatChoice == 1) {
                ticketPrice += 100; // Gold seat
            } else if (seatChoice == 2) {
                ticketPrice += 50; // Silver seat
            } else {
                System.out.println("-> Invalid seat choice.");
                continue;

            }
            System.out.println("-------------------------------------------------");
            System.out.print("-> Do you want snacks? (Y/N): ");
            char snackChoice = input.next().charAt(0);

            if (snackChoice == 'Y' || snackChoice == 'y') {
                snackPrice = 80;
            }

            double finalAmount = ticketPrice + snackPrice;

            // Display bill
            System.out.println("-------------------------------------------------");
            System.out.printf(" %-20s   |   Rs.%-20.2f%n", "Ticket Price", ticketPrice);
            System.out.printf(" %-20s   |   Rs.%-20.2f%n", "Snacks Price", snackPrice);
            System.out.println("-------------------------------------------------");
            System.out.printf(" %-20s   |   Rs.%-20.2f%n", "Total Amount", finalAmount);
            System.out.println("-------------------------------------------------");

            System.out.print("Next customer? (Y/N): ");
            continueChoice = input.next().charAt(0);
            System.out.println("-------------------------------------------------");

        } while (continueChoice == 'Y' || continueChoice == 'y');

        System.out.println("=================================================");
        System.out.println("        THANK YOU FOR VISITING!");
        System.out.println("=================================================");
        input.close();
    }
}
