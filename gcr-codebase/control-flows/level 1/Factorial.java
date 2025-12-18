// Create Factorial class to calculate factorial of an integer using while-loop.
import java.util.Scanner;
public class Factorial {
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
        int i = num;
        long factorial = 1;
        while(i > 0) {
            factorial *= i;
            i--;
        }

        // Display the factorial of number
        System.out.println("Factorial of " + num + " is " + factorial);
	input.close(); // Close Scanner object
    }
}