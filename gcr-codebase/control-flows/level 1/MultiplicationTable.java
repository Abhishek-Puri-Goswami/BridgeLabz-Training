// Create MultiplicationTable class to print multiplication table from 6 to 9 of the given number.
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
    // Create Scanner object to take inputs from user
        Scanner input = new Scanner(System.in);
 
        // Input an integer number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Display multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

	input.close(); // Close Scanner object
    }
}