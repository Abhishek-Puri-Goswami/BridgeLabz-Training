import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        // Create Scanner object to take inputs from user
        Scanner input = new Scanner(System.in);

        // Input the base number and power
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        System.out.print("Enter the power: ");
        int power = input.nextInt();

        // calculate the power of the number
        int result = 1;
        for(int i = 1; i <= power; i++) {
            result *= number; // Multiply number with itself power times
        }

        // Display the result
        System.out.println(number + " raised to the power of " + power + " is " + result);
	input.close(); // Close Scanner object
    }
}
