
// Create PrintEvenAndOddNumbers class to print even and odd numbers from 1 to N.
import java.util.Scanner;
public class PrintEvenAndOddNumbers {
    public static void main(String[] args) {
        // Create Scanner object to take inputs from user
        Scanner input = new Scanner(System.in);

        // Input an integer number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check for natural number
        if (number < 0) {
            System.out.println("Please enter a valid number!");
        }

        // Display even numbers from 1 to the number
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is an even number.");
            } else {
                System.out.println(i + " is an odd number.");
            }
        }

        input.close(); // Close Scanner object
    }
}