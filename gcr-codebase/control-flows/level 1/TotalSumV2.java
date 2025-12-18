// Create TotalSumV2 class to calculate sum until the user press 0.
import java.util.Scanner;
public class TotalSumV2 {
    public static void main(String[] args) {
        // Create Scanner object to take inputs from user
        Scanner input = new Scanner(System.in);
        double number = 1, total = 0.0;
 
        // Calculate total sum 
        System.out.println("Press 0 or any negative number to get total sum :- ");
        while(number > 0) {
            // Input a number
	    System.out.print("Enter a number : ");
            number = input.nextDouble();
	    if(number > 0) {
                total += number;
            }
        }

        // Display the total sum calculated
        System.out.print("The total value is " + total);
        
	input.close(); // Close Scanner object
    }
}