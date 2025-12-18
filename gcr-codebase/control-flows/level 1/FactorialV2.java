// Create FactorialV2 class to calculate factorial of an integer using for-loop.
import java.util.Scanner;
public class FactorialV2 {
    public static void main(String[] args) {
        // Create Scanner object to take inputs from user
        Scanner input = new Scanner(System.in);
        
        // Input an integer number
	System.out.print("Enter an integer number: ");
        int num = input.nextInt();

	// Check for positive number
        if(num < 0) {
            System.out.println("Please enter a valid number");
            return;
        }

        // Calculate the factorial of the number
        long factorial = 1;
        for(int i = num; i > 0; i--) {
            factorial *= i;
        }

        // Display the factorial of number
        System.out.println("Factorial of " + num + " is " + factorial);
	input.close(); // Close Scanner object
    }
}