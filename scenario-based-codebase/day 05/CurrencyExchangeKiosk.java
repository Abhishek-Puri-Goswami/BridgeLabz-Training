
/**
 * 18. Currency Exchange Kiosk
 * Design a currency converter
 * Take INR amount and target currency.
 * Use a switch to apply the correct rate.
 * Ask if the user wants another conversion (do-while).
 */

import java.util.Scanner;
public class CurrencyExchangeKiosk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter amount in INR: ");
            double inrAmount = input.nextDouble();

            System.out.println("\nSelect target currency:");
            System.out.println("1. USD");
            System.out.println("2. EUR");
            System.out.println("3. GBP");
            System.out.println("4. JPY");
            System.out.print("Enter your choice (1-4): ");
            int currencyChoice = input.nextInt();

            double convertedAmount = 0;
            // Switch to apply exchange rate
            switch (currencyChoice) {
                case 1:
                    convertedAmount = inrAmount * 0.012;
                    System.out.println("Converted Amount in USD: " + convertedAmount);
                    break;
                case 2:
                    convertedAmount = inrAmount * 0.011;
                    System.out.println("Converted Amount in EUR: " + convertedAmount);
                    break;
                case 3:
                    convertedAmount = inrAmount * 0.010;
                    System.out.println("Converted Amount in GBP: " + convertedAmount);
                    break;
                case 4:
                    convertedAmount = inrAmount * 1.65;
                    System.out.println("Converted Amount in JPY: " + convertedAmount);
                    break;
                default:
                    System.out.println("Invalid currency selection.");
            }

            System.out.print("\nDo you want another conversion? (y/n): ");
            choice = input.next().toLowerCase().charAt(0);

        } while (choice == 'y');

        System.out.println("\nThank you for using Currency Exchange Kiosk.");

        input.close();
    }
}
