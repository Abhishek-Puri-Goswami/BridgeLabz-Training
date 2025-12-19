import java.util.Scanner;
public class BMICalculator2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int numPersons = input.nextInt();
        // Declare a 2D array to store height, weight, and BMI
        double[][] personData = new double[numPersons][3];
        // Declare an array to store weight status
        String[] weightStatus = new String[numPersons];
        // Input height and weight for each person
        for (int i = 0; i < numPersons; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            // Input height and validate
            do {
                System.out.print("Enter height (in meters) for person " + (i + 1) + ": ");
                personData[i][0] = input.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Height must be a positive value. Please try again.");
                }
            } while (personData[i][0] <= 0);

            // Input weight and validate
            do {
                System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
                personData[i][1] = input.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Weight must be a positive value. Please try again.");
                }
            } while (personData[i][1] <= 0);
        }

        // Calculate BMI and determine weight status
        for (int i = 0; i < numPersons; i++) {
            double height = personData[i][0];
            double weight = personData[i][1];

            // Calculate BMI
            personData[i][2] = weight / (height * height);

            // Determine weight status
            double bmi = personData[i][2];
            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display the results
        System.out.println("\nHeight\tWeight\tBMI\tStatus");
        for (int i = 0; i < numPersons; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s\n", personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
        input.close();
    }
}
