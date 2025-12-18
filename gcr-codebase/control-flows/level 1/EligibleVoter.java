// Create EligibleVoter class to check if a person's age is eligible to vote.
import java.util.Scanner;
public class EligibleVoter {
    public static void main(String[] args) {
        // Create Scanner object to take inputs from user
        Scanner input = new Scanner(System.in);
        
        // Input person's age
	System.out.print("Enter your age : ");
        int age = input.nextInt();

        // Display whether person is eligible voter or not
        if(age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else { 
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

	input.close(); // Close Scanner object
    }
}