import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        // Create Scanner object to take inputs from user
        Scanner input = new Scanner(System.in);

        // Take a positive integer from the user
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check if the number is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Iterate numbers from 1 to the number
            for (int i = 1; i <= number; i++) {
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
            }
        }
        input.close(); // Close Scanner object
    }
}
