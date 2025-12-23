import java.util.Scanner;

public class BasicCalculator {
    // Function to perform addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Function to perform subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Function to perform multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Function to perform division
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN; // Return NaN (Not a Number) if division by zero
        }
        return a / b;
    }

    // Method to get user input
    public static double getInput(String prompt) {
        Scanner input = new Scanner(System.in);
        System.out.print(prompt);
        double value = input.nextDouble();
        input.close();
        return value;
    }

    // Method to display the result
    public static void displayResult(double result) {
        System.out.println("The result is: " + result);
    }

    // Main method to tie everything together
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Display operation choices to the user
        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter the number of the operation you want to perform: ");
        int choice = input.nextInt();

        // Get two numbers from the user
        double num1 = getInput("Enter the first number: ");
        double num2 = getInput("Enter the second number: ");

        // Perform the chosen operation
        double result = 0;
        switch (choice) {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = subtract(num1, num2);
                break;
            case 3:
                result = multiply(num1, num2);
                break;
            case 4:
                result = divide(num1, num2);
                break;
            default:
                System.err.println("Invalid choice. Please select a valid operation.");
                System.exit(0);
        }

        // Display the result
        displayResult(result);
        input.close();
    }
}
