// Create FirstNumberSmallest class to check if first number is the smallest of three numbers
import java.util.Scanner;
public class FirstNumberSmallest {
    public static void main(String[] args) {
        // Create Scanner object to take inputs from user
        Scanner input = new Scanner(System.in);
        
        // Input three integer numbers
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        // Display whether first number is the smallest
        System.out.print("Is the first number the smallest? ");
        if(number1 < number2 && number1 < number3) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
	input.close(); // Close Scanner object
    }
}