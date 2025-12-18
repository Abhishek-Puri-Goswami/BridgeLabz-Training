import java.util.Scanner;
public class CheckPrimeNumber {
    public static void main(String[] args) {
        // Create Scanner object to take inputs from user
        Scanner input = new Scanner(System.in);

        // Input an integer number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Numbers less than or equal to 1 are not prime
        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
        } else {
            boolean isPrime = true;
            // iterate from 2 to the (number - 1)
            for (int i = 2; i < number; i++) {
                // Check if divisible by any number
                if (number % i == 0) {
                    isPrime = false;  // Not prine if divisible
                    break;  // break the loop, if not prime 
               }
            }

            // Display the result
            if (isPrime) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }
        input.close(); // Close Scanner object
    }
}
