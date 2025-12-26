import java.util.Scanner;

public class MetroSmartCard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance = 100.0;

        while (balance > 0) {
            System.out.println("\nCurrent Balance: ₹" + balance);
            System.out.print("Enter distance (0 to quit): ");
            int distance = input.nextInt();

            if (distance == 0) {
                break;
            }
            int fare = (distance <= 5) ? 10 : 20;
            if (balance >= fare) {
                balance -= fare;
                System.out.println("Fare deducted: ₹" + fare);
            } else {
                System.out.println("Insufficient balance!");
                break;
            }
        }

        System.out.println("\nTrip ended. Remaining Balance: ₹" + balance);
        input.close();
    }
}
