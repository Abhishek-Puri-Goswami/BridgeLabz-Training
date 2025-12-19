import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numOfEmployees = 10;
        // Arrays to store data for employees
        double[] salaries = new double[numOfEmployees];
        double[] yearsOfService = new double[numOfEmployees];
        double[] bonuses = new double[numOfEmployees];
        double[] newSalaries = new double[numOfEmployees];
        // Variables for totals
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // Input for salaries and years of service
        for (int i = 0; i < numOfEmployees; i++) {
            boolean validInput = false;
            while (!validInput) {
                System.out.print("Enter salary for employee " + (i + 1) + ": ");
                double salary = input.nextDouble();
                System.out.print("Enter years of service for employee " + (i + 1) + ": ");
                double years = input.nextDouble();

                if (salary > 0 && years >= 0) {
                    salaries[i] = salary;
                    yearsOfService[i] = years;
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Salary must be positive, and years of service must not be negative. Try again.");
                }
            }
        }

        // Iterate for bonuses and new salaries
        for (int i = 0; i < numOfEmployees; i++) {
            double salary = salaries[i];
            double years = yearsOfService[i];

            // Calculate bonus percentage based on years of service
            double bonusPercentage = (years > 5) ? 0.05 : 0.02;

            double bonus = salary * bonusPercentage;
            double newSalary = salary + bonus;

            // Store results in arrays
            bonuses[i] = bonus;
            newSalaries[i] = newSalary;

            // Update totals
            totalBonus += bonus;
            totalOldSalary += salary;
            totalNewSalary += newSalary;
        }

        // Display the results
        System.out.println("\nSummary of Bonus Calculations:");
        for (int i = 0; i < numOfEmployees; i++) {
            System.out.printf("Employee %d: Old Salary = %.2f, Bonus = %.2f, New Salary = %.2f\n", 
                              (i + 1), salaries[i], bonuses[i], newSalaries[i]);
        }
        System.out.println("\nTotals:");
        System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total Bonus Payout: %.2f\n", totalBonus);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);
        input.close();
    }
}
