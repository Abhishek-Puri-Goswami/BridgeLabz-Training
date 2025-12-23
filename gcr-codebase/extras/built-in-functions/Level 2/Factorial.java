import java.util.Scanner;
public class Factorial {
    // Recursive function to calculate factorial
    public static int calculateFactorial(int number) {
        if (number == 1) { // base case
            return 1;
        }
        return number * calculateFactorial(number - 1);
    }

    // Method to get user input
    public static int getInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int value = input.nextInt();
        input.close();
        return value;
    }

    // Method to display the output
    public static void displayOutput(int number, int factorial) {
        System.out.println("The factorial of " + number + " is: " + factorial);
    }

    public static void main(String[] args) {
        int number = getInput();
        // Calculate factorial using recursion
        int factorial = calculateFactorial(number);
        // Display the result
        displayOutput(number, factorial);
    }
}
