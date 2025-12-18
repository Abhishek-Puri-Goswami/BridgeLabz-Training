// Create SumOfNaturalNumbers class to check if first number is natural number and calculate sum of n natural numbers
import java.util.Scanner;
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        // Create Scanner object to take inputs from user
        Scanner input = new Scanner(System.in);
        
        // Input an integer number
        System.out.print("Enter an integer : ");
        int number = input.nextInt();
      
        // Display whether the number is natural number
        if(number >= 0) {
            // Calculate sum of n natural numbers
            int sum = (number * (1 + number)) / 2;
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
       	input.close(); // Close Scanner object
    }
}