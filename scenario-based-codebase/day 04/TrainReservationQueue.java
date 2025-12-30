/**
* 12. Train Reservation Queue
*     Simulate a basic ticket booking system. 
*     Show menu with switch
*     Allow multiple bookings using while-loop.
*     Stop booking once seats reach zero (break).
*/

import java.util.Scanner;
public class TrainReservationQueue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=======================================");
        System.out.println("       TRAIN RESERVATION SYSTEM");
        System.out.println("=======================================");

        System.out.print("Enter number of seats available: ");
        int availableSeats = input.nextInt();
        
        if(availableSeats < 0) {
            System.err.println("Seats number can't be negative!");
            System.exit(0);
        }
        
        boolean running = true;
        // While-loop to allow multiple bookings
        while (running) {
            System.out.println("----------------- MENU ----------------");
            System.out.println("1. Book Ticket");
            System.out.println("2. Check Available Seats");
            System.out.println("3. Exit");
            System.out.println("---------------------------------------");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();

            // Switch for menu handling
            switch (choice) {
                case 1:
                    if (availableSeats > 0) {
                        availableSeats--;
                        System.out.println("-> Ticket booked successfully!");
                    } else {
                        System.out.println("-> No seats available. Booking closed.");
                        running = false; // exit loop
                    }
                    break;

                case 2:
                    System.out.printf("-> Available Seats : %d%n", availableSeats);
                    break;

                case 3:
                    System.out.println("-> Exiting reservation system...");
                    running = false;
                    break;

                default:
                    System.out.println("-> Invalid choice. Please select again.");
            }

            // Stop booking once seats reach zero
            if (availableSeats == 0) {
                System.out.println("-> All seats are booked. Reservation closed.");
                break;
            }
        }

        System.out.println("========================================");
        System.out.println("   THANK YOU FOR USING THE SYSTEM");
        System.out.println("========================================");
        input.close();
    }
}
