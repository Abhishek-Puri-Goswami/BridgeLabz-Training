import java.util.Scanner;
public class CoffeeCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double GST_RATE = 0.05;
        while (true) {
            System.out.println("\nEnter coffee type (espresso / latte / cappuccino) or type 'exit' to stop:");
            String coffeeType = input.next().toLowerCase();

            if (coffeeType.equals("exit")) {
                System.out.println("Thank you for visiting Ravi's Café!");
                break; // Exit
            }

            double pricePerCup;
            switch (coffeeType) {
                case "espresso":
                    pricePerCup = 120;
                    break;
                case "latte":
                    pricePerCup = 150;
                    break;
                case "cappuccino":
                    pricePerCup = 180;
                    break;
                default:
                    System.out.println("Invalid coffee type. Please try again.");
                    continue;
            }

            System.out.print("Enter quantity: ");
            int quantity = input.nextInt();

            double totalPrice = pricePerCup * quantity;
            double gstAmount = totalPrice * GST_RATE;
            double finalBill = totalPrice + gstAmount;

            System.out.println("Total Price: ₹" + totalPrice);
            System.out.println("GST (5%): ₹" + gstAmount);
            System.out.println("Final Bill Amount: ₹" + finalBill);
        }
        input.close();
    }
}
