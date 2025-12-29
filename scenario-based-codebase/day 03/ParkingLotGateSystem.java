
/**
 * 6. Parking Lot Gate System:-
 *      Develop a smart parking system.
 *      Options: Park, Exit, Show Occupancy
 *      Use switch-case for the menu.
 *      while loop to continue until the parking lot is full or the user exits.
 */
import java.util.Scanner;

public class ParkingLotGateSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the maximum occupancy capacity: ");
        int maxOccupancy = input.nextInt();
        int currOccupancy = 0;

        System.out.println("=============================================");
        System.out.println("        WELCOME TO PARKING LOT SYSTEM");
        System.out.println("=============================================");
        System.out.println("Press \"quit\" to close");

        while (true) {
            System.out.println("---------------------------------------------");
            System.out.println("Available options:-");
            System.out.println("\t\"park\"\t-> to enter parking lot.");
            System.out.println("\t\"exit\"\t-> to exit parking lot.");
            System.out.println("\t\"show\"\t-> to show occupancy status.");
            System.out.println("---------------------------------------------");

            System.out.print("Input action to be performed: ");
            String action = input.next().toLowerCase();

            if (action.equals("quit")) {
                System.out.println("THANK YOU FOR VISITING.");
                System.out.println("=============================================");
                break;
            }

            switch (action) {
                case "park":
                    if (currOccupancy < maxOccupancy) {
                        currOccupancy++;
                        System.out.println("-> Vehicle entered the parking lot.");
                    } else {
                        System.out.println("-> All parking lots are already full!");
                    }
                    break;

                case "exit":
                    if (currOccupancy != 0) {
                        currOccupancy--;
                        System.out.println("-> Vehicle left the parking lot.");
                    } else {
                        System.out.println("-> All parking lots are already empty!");
                    }
                    break;

                case "show":
                    System.out.println(
                            "-> Occupancy status: " + currOccupancy + "/" + maxOccupancy + " as [occupied/total]");
                    break;

                default:
                    System.out.println("-> Invalid input! Please try again.");
            }
        }
        input.close();
    }
}
