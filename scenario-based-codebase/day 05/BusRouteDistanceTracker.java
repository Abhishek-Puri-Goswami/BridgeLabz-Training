
/**
* 19. Bus Route Distance Tracker
* Each stop adds distance.
* Ask if the passenger wants to get off at a stop.
* Use a while-loop with a total distance tracker.
* Exit on user confirmation.
*/

import java.util.Scanner;

public class BusRouteDistanceTracker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double totalDistance = 0;
        int stopNumber = 1;

        // Loop continues until passenger chooses to get off
        while (true) {

            System.out.print("Enter distance from stop " + stopNumber + " (in km): ");
            double distance = input.nextDouble();
            totalDistance += distance;

            System.out.print("Do you want to get off at stop " + stopNumber + "? (y/n): ");
            char choice = input.next().toLowerCase().charAt(0);

            // Exit bus
            if (choice == 'y') {
                break;
            }
            stopNumber++;
        }

        System.out.println("\nPassenger got off at stop " + stopNumber);
        System.out.println("Total distance travelled: " + totalDistance + " km");
        input.close();
    }
}
