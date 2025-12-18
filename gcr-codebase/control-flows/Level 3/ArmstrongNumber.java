import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        // Create Scanner object to take inputs from user
        Scanner input = new Scanner(System.in);

        // Input an integer number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Store the original number for comparison later
        int originalNumber = number;
        // Store the sum of cubes of digits
        int sum = 0;  

        // Find digits and sum of cube of digits
        while (number != 0) {
            int digit = number % 10;  // Last digit
            sum += Math.pow(digit, 3);  // Sum of cube of digit
            number /= 10;  // Remove last digit
        }

        // Armstrong Number: if the sum of cubes is equal to the original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
        input.close(); // close Scanner object
    }
}
