
/**
 * 8. Shopkeeper’s Discount Dashboard 
 *      A shopkeeper gives discounts based on total bill
 *      Input item prices in a for-loop.
 *      Use if-else for discount logic.
 *      Use proper indentation, constants, and comments.
 */

import java.util.Scanner;

public class ShopkeepersDiscountDashboard {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Constants for discount rates
        final double DISCOUNT_10 = 0.10;
        final double DISCOUNT_20 = 0.20;

        double totalBill = 0.0;
        double discount = 0.0;
        double finalAmount;

        System.out.println("===================================");
        System.out.println("  SHOPKEEPER'S DISCOUNT DASHBOARD");
        System.out.println("===================================");

        System.out.print("Enter number of items purchased: ");
        int items = input.nextInt();

        System.out.println("-----------------------------------");
        System.out.printf("%-15s | %-15s \n", "Item No", "Price (Rs.)");
        System.out.println("-----------------------------------");

        // Input item prices using for-loop
        for (int i = 1; i <= items; i++) {
            System.out.printf("Item-%-10s |  ", i);
            double price = input.nextDouble();
            totalBill += price;
        }

        // Discount logic using if-else
        if (totalBill >= 500 && totalBill < 1000) {
            discount = totalBill * DISCOUNT_10;
        } else if (totalBill >= 1000) {
            discount = totalBill * DISCOUNT_20;
        }

        finalAmount = totalBill - discount;
        // Summary table
        System.out.println("===================================");
        System.out.printf("%-15s |  Rs. %-10.2f\n", "Total Bill", totalBill);
        System.out.printf("%-15s |  Rs. %-10.2f\n", "Discount", discount);
        System.out.printf("%-15s |  Rs. %-10.2f\n", "Final Bill", finalAmount);
        System.out.println("===================================");

        input.close();
    }
}
