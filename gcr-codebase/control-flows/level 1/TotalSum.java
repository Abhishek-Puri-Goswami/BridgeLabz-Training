// Create TotalSum class to calculate sum until the user press 0.
import java.util.Scanner;
public class TotalSum {
    public static void main(String[] args) {
        // Create Scanner object to take inputs from user
        Scanner input = new Scanner(System.in);
        double number = 1, total = 0.0;
 
        // Calculate total sum 
        System.out.println("Press 0 to get total sum :- ");
        while(number != 0) {
            // Input a number
	    System.out.print("Enter a number : ");
            number = input.nextDouble();
            total += number;
        }

        // Display the total sum calculated
        System.out.print("The total value is " + total);
        
	input.close(); // Close Scanner object
    }
}