import java.util.Scanner;
public class AbundantNumber {
    public static void main(String[] args) {
        // Create Scanner object to take inputs from user
        Scanner input = new Scanner(System.in);
        // Input an integer number
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // Initialize sum of divisors to 0
        int sum = 0;
        // Iterate to find all divisors of the number
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;  // Add divisor
            }
        }

        // Abundant Number: if the sum of divisors is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant number.");
        } else {
            System.out.println(number + " is not an Abundant number.");
        }
        input.close(); // Close Scanner object
    }
}
