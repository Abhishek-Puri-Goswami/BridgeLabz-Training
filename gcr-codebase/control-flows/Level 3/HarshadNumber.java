import java.util.Scanner;
public class HarshadNumber {
    public static void main(String[] args) {
        // Create Scanner object to take inputs from user
        Scanner input = new Scanner(System.in);
        // Input an integer number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Store the sum of digits
        int sum = 0;
        // Store original number copy
        int originalNumber = number;
        // Iterate to calculate the sum of digits
        while (number != 0) {
            sum += number % 10; // Add last digit
            number /= 10; // Remove last digit
        }

        // Harshad Number: if the number is divisible by the sum of its digits
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad number.");
        } else {
            System.out.println(originalNumber + " is not a Harshad number.");
        }

        input.close(); // Close Scanner object
    }
}
