import java.util.Random;
public class ZaraBonusCalculator {
    // Method to generate random salary (5-digit) and random years of service (less than 10)
    public static double[][] generateEmployeeData(int numEmployees) {
        Random random = new Random();
        // 2D array for salary and years of service
        double[][] employeeData = new double[numEmployees][2]; 

        // Random salary between 10000 and 99999 and random years of service between 1 and 10
        for (int i = 0; i < numEmployees; i++) {
            employeeData[i][0] = 10000 + random.nextInt(90000); // Random salary between 10000 and 99999
            employeeData[i][1] = 1 + random.nextInt(10); // Random years of service between 1 and 10
        }
        return employeeData;
    }

    // Method to calculate new salary and bonus based on years of service
    public static double[][] calculateNewSalaryAndBonus(double[][] employeeData) {
        double[][] updatedData = new double[employeeData.length][3]; // [Salary, Years of Service, Bonus]

        for (int i = 0; i < employeeData.length; i++) {
            double oldSalary = employeeData[i][0];
            double yearsOfService = employeeData[i][1];

            // Calculate the bonus based on years of service
            double bonusPercentage = (yearsOfService > 5) ? 0.05 : 0.02;
            double bonusAmount = oldSalary * bonusPercentage;

            // Calculate the new salary
            double newSalary = oldSalary + bonusAmount;

            // Store old salary, new salary and bonus in the updatedData array
            updatedData[i][0] = oldSalary;
            updatedData[i][1] = newSalary;
            updatedData[i][2] = bonusAmount;
        }

        return updatedData;
    }

    // Method to calculate the total sum of old salary, new salary, and total bonus
    public static double[] calculateTotalSums(double[][] updatedData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        for (int i = 0; i < updatedData.length; i++) {
            totalOldSalary += updatedData[i][0];
            totalNewSalary += updatedData[i][1];
            totalBonus += updatedData[i][2];
        }

        return new double[]{totalOldSalary, totalNewSalary, totalBonus};
    }

    // Method to display the results in a tabular format
    public static void displayResults(double[][] updatedData, double[] totals) {
        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-10s | %12s | %12s | %10s%n",
            "Employee", "Old Salary", "New Salary", "Bonus");
        System.out.println("---------------------------------------------------------------");
        for (int i = 0; i < updatedData.length; i++) {
            System.out.printf("%-10s | %12.2f | %12.2f | %10.2f%n",
                "Employee " + (i + 1),
                updatedData[i][0],
                updatedData[i][1],
                updatedData[i][2]);
        }
        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-10s | %12.2f | %12.2f | %10.2f%n",
            "Total",
            totals[0],
            totals[1],
            totals[2]);
        System.out.println("---------------------------------------------------------------");
    }

    public static void main(String[] args) {
        int numEmployees = 10;
        double[][] employeeData = generateEmployeeData(numEmployees);
        double[][] updatedData = calculateNewSalaryAndBonus(employeeData);
        double[] totals = calculateTotalSums(updatedData);

        // Display the results in a tabular format
        displayResults(updatedData, totals);
    }
}
