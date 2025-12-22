import java.util.Scanner;
public class BMICalculator {
    // Method to calculate BMI and status for each person
    public static String[][] calculateBMI(double[][] heightWeightArray) {
        String[][] bmiData = new String[10][4]; // To store Height, Weight, BMI, and Status

        for (int i = 0; i < 10; i++) {
            double weight = heightWeightArray[i][0];
            double heightCm = heightWeightArray[i][1];
            double heightM = heightCm / 100; // Convert cm to meters
            double bmi = weight / (heightM * heightM); // Calculate BMI

            String status;
            if (bmi <= 18.5) {
                status = "Underweight";
            } else if (bmi < 24.9) {
                status = "Normal weight";
            } else if (bmi < 39.9) {
                status = "Overweight";
            } else if (bmi >= 40.0) {
                status = "Obese";
            } else {
				status = "Invalid";
			}

            bmiData[i][0] = String.format("%.2f", weight);
            bmiData[i][1] = String.format("%.2f", heightCm);
            bmiData[i][2] = String.format("%.2f", bmi);
            bmiData[i][3] = status;
        }
        return bmiData;
    }

    // Method to display the BMI data in a tabular format
    public static void displayBMIData(String[][] bmiData) {
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Weight(kg)", "Height(cm)", "BMI", "Status");
        System.out.println("-------------------------------------------------");
        for (String[] person : bmiData) {
            System.out.printf("%-10s %-10s %-10s %-15s\n", person[0], person[1], person[2], person[3]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] heightWeightArray = new double[10][2];

        // Taking input for height and weight
        System.out.println("Enter the weight (kg) and height (cm) for 10 people:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Person %d Weight (kg): ", i + 1);
            heightWeightArray[i][0] = input.nextDouble();
            System.out.printf("Person %d Height (cm): ", i + 1);
            heightWeightArray[i][1] = input.nextDouble();
        }   
        // Calculate BMI and status
        String[][] bmiData = calculateBMI(heightWeightArray);

        // Display the BMI data
        displayBMIData(bmiData);
        input.close();
    }
}
