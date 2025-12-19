import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Input an integer number
        int number = input.nextInt();

        // Check number is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Create a String array to store the results
            String[] results = new String[number + 1];

            // Iterate from 0 to number
            for (int i = 0; i <= number; i++) {
                if (i % 15 == 0) {
                    results[i] = "FizzBuzz";  // Multiple of both 3 and 5
                } else if (i % 3 == 0) {
                    results[i] = "Fizz";  // Multiple of 3
                } else if (i % 5 == 0) {
                    results[i] = "Buzz";  // Multiple of 5
                } else {
                    results[i] = Integer.toString(i);  // Other numbers
                }
            }

            // Iterate the array and display the results
            for (int i = 0; i < results.length; i++) {
                System.out.println("Position " + i + " = " + results[i]);
            }
        }
        input.close();
    }
}
