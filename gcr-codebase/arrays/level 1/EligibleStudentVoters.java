// Create EligibleStudentVoters class to check students voting eligibility
import java.util.Scanner;
public class EligibleStudentVoters {
    public static void main(String[] args) {
        // Create Scanner object to take inputs from user
        Scanner input = new Scanner(System.in);
        
        // Create an array to store ages
        int[] age = new int[10];

        // Input the student ages into array
        System.out.print("Enter 10 students ages: ");
        for(int i = 0; i < age.length; i++) {
           age[i] = input.nextInt();
        }

        // Iterate ages to display voting eligibility
        for(int i = 0; i < age.length; i++) {
            // Invalid negative age
            if(age[i] < 0) {
                System.out.println("Invalid age.");
            } 
            // Valid positive age
            else {
                // Student can vote 
                if(age[i] >= 18) {
                    System.out.println("The student with the age " + age[i] + " can vote.");
                } 
                // Student cannot vote
                else {
                    System.out.println("The student with the age "+ age[i] + " cannot vote.");
                }
            }
        }
        

	input.close(); // Close Scanner object
    }
}