// Create SumOfNaturalNumbersV3 class to calculate sum of N natural numbers using for-loop and (n * (n - 1) / 2) and compare both.
import java.util.Scanner;
public class SumOfNaturalNumbersV3 {
    public static void main(String[] args) {
        // Create Scanner object to take inputs from user
        Scanner input = new Scanner(System.in);
        
        // Input an integer number
        System.out.print("Enter a number : ");
        int number = input.nextInt();
      
        // Calculate sum of natural numbers using formula
        int sum1 = number * (number + 1) / 2;
        
        // Calculate sum of natural numbers using for-loop
        int sum2 = 0;
        for(int i = number; i > 0; i--) {
            sum2 += i;
        }

        // Display the results
        System.out.println("Sum of " + number + " natural numbers using formula is " + sum1 + " and using for-loop is " + sum2);

       	input.close(); // Close Scanner object
    }
}