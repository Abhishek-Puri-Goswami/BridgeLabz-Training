import java.util.Scanner;

public class TeamBMI {
    // Method to calculate the BMI for each person
    public static void calculateBMI(double[][] teamData) {
        for (int i = 0; i < teamData.length; i++) {
            // Convert height from cm to meters
            double heightInMeters = teamData[i][1] / 100.0;
            // Calculate BMI using the formula
            teamData[i][2] = teamData[i][0] / (heightInMeters * heightInMeters);
        }
    }
    // Method to determine the BMI status of each person
    public static String[] determineBMIStatus(double[][] teamData) {
        String[] bmiStatus = new String[teamData.length];
        for (int i = 0; i < teamData.length; i++) {
            double bmi = teamData[i][2];
            if (bmi <= 18.4) {
                bmiStatus[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                bmiStatus[i] = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                bmiStatus[i] = "Overweight";
            } else {
                bmiStatus[i] = "Obese";
            }
        }
        return bmiStatus;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Array to store weight, height, and BMI for 10 members
        double[][] teamData = new double[10][3];

        // Input for weight and height of 10 team members
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            teamData[i][0] = input.nextDouble();

            System.out.print("Enter height (in cm) for person " + (i + 1) + ": ");
            teamData[i][1] = input.nextDouble();
        }

        // Calculate BMI for each person
        calculateBMI(teamData);

        // Determine the BMI status for each person
        String[] bmiStatuses = determineBMIStatus(teamData);

        // Display the height, weight, BMI, and status of each individual
        System.out.printf("%n%-10s %-10s %-10s %-15s%n", "Weight(kg)", "Height(cm)", "BMI", "Status");
        for (int i = 0; i < teamData.length; i++) {
            System.out.printf(
                "%-10.2f %-10.2f %-10.2f %-15s%n",
                teamData[i][0], teamData[i][1], teamData[i][2], bmiStatuses[i]
            );
        }
        input.close();
    }
}
