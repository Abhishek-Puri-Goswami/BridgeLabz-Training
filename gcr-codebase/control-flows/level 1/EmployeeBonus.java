// Create EmployeeBonus class to calculate the employees bonus based on their years of service.
import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {
        // Create Scanner object to take inputs from user
        Scanner input = new Scanner(System.in);
        
        // Take salary and years of service as input
        System.out.print("Enter the employee's salary: ");
        double salary = input.nextDouble();
        System.out.print("Enter the employee's years of service: ");
        int yearsOfService = input.nextInt();

        // Check years of service and calculate bonus
        if (yearsOfService > 5) {
            // Calculate 5% bonus
            double bonus = salary * 5 / 100;
            System.out.println("Eligible for a bonus of: " + bonus);
        } else {
            System.out.println("Not eligible for a bonus.");
        }

	input.close(); // Close Scanner object
    }
} 