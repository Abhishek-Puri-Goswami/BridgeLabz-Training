// Create CheckNumberSign class to check if first number is the smallest of three numbers
import java.util.Scanner;
public class CheckNumberSign {
    public static void main(String[] args) {
        // Create Scanner object to take inputs from user
        Scanner input = new Scanner(System.in);
        
        // Input the integer number
	System.out.print("Enter a number : ");
        int number = input.nextInt();

        // Display whether the number is positive, negative or zero
        if(number > 0) {
            System.out.println("Positive");
        } else if(number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

	input.close(); // Close Scanner object
    }
}