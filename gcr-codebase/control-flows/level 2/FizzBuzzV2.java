import java.util.Scanner;
public class FizzBuzzV2 {
    public static void main(String[] args) {
        // Create Scanner object to take inputs from user
        Scanner input = new Scanner(System.in);

        // Input an integer number
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Check if the number is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int i = 1; // Initialize counter
            // Iterate from 1 to the number
            while (i <= number) {
                // Divisible by both 3 and 5
                if (i % 15 == 0) {
                    System.out.println("FizzBuzz");
                }
                // Divisible by 3
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                // Divisible by 5
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                // Display the number
                else {
                    System.out.println(i);
                }
                i++; // Increment counter
            }
        }
        input.close(); // Close Scanner object

    }
}
