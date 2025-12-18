// Create DivisibleByFive Class to check if the number is divisible by 5
import java.util.Scanner;
public class DivisibleByFive {
    public static void main(String[] args) {
        // Create Scanner object to take inputs from user
        Scanner input = new Scanner(System.in);
        
        // Input an integer number
        int number = input.nextInt(); 

	// // Display whether number divisible by 5
        System.out.print("Is the number " + number + " divisible by 5? ");
        if(number % 5 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
	input.close();
    }
}