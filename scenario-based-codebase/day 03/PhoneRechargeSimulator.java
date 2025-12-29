/**
 * 10. Phone Recharge Simulator
 *      Take the user's mobile operator and amount.
 *      Use a switch to display offers.
 *      Loop to allow repeated recharges.
 *      Show balance after each recharge.
 */
import java.util.Scanner;

public class PhoneRechargeSimulator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double balance = 0;
        char choice;

        System.out.println("======================================================");
        System.out.println("              PHONE RECHARGE SIMULATOR");
        System.out.println("======================================================");

        do {
            System.out.println("\nSelect Mobile Operator:");
            System.out.println("1. Jio");
            System.out.println("2. Airtel");
            System.out.println("3. Vi");
            System.out.println("------------------------------------------------------");
            System.out.print("Enter choice (1-3): ");
            int operator = sc.nextInt();

            System.out.print("Enter recharge amount (Rs.): ");
            double amount = sc.nextDouble();

            balance += amount;

            System.out.println("------------------------------------------------------");
            System.out.printf("%-20s : ₹%.2f%n", "Recharge Amount", amount);

            // Display offers using switch
            switch (operator) {
                case 1:
                    System.out.printf("%-20s : %s%n", "Operator", "Jio");
                    System.out.println("Offer Applied        | 1GB Data + Unlimited Calls");
                    break;

                case 2:
                    System.out.printf("%-20s : %s%n", "Operator", "Airtel");
                    System.out.println("Offer Applied        | 1.5GB Data + OTT Benefits");
                    break;

                case 3:
                    System.out.printf("%-20s : %s%n", "Operator", "Vi");
                    System.out.println("Offer Applied        | 2GB Data + Weekend Rollover");
                    break;

                default:
                    System.out.println("Invalid operator selected!");
                    balance -= amount; // rollback
                    break;
            }

            System.out.println("------------------------------------------------------");
            System.out.printf("%-20s | ₹%.2f%n", "Current Balance", balance);
            System.out.println("------------------------------------------------------");

            System.out.print("Do you want to recharge again? (Y/N): ");
            choice = sc.next().charAt(0);

        } while (choice == 'Y' || choice == 'y');

        System.out.println("\n======================================================");
        System.out.println("        THANK YOU FOR USING RECHARGE SERVICE");
        System.out.println("======================================================");

        sc.close();
    }
}
