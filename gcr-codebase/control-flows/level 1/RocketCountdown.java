// Create RocketCountdown class to print count down from N to 1 using while loop.
import java.util.Scanner;
public class RocketCountdown {
    public static void main(String[] args) {
        // Create Scanner object to take inputs from user
        Scanner input = new Scanner(System.in);
        
        // Input an integer number
	System.out.print("Enter the countdown value: ");
        int counter = input.nextInt();
        
        if(counter <= 0) {
            System.out.println("Invalid counter value");
            return;
        }
        // print the count down using while-loop
        while(counter > 0) {
            System.out.print(counter + " ");
            counter--;
        }
        System.out.println();

	input.close(); // Close Scanner object
    }
}