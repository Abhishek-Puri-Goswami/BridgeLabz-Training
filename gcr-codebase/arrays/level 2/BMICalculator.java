import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int numPersons = input.nextInt();
        double[] heights = new double[numPersons];
        double[] weights = new double[numPersons];
        double[] bmis = new double[numPersons];
        String[] statuses = new String[numPersons];
        // Input height and weight for each person
        for (int i = 0; i < numPersons; i++) {
            System.out.print("Enter height (in metres) for person " + (i + 1) + ": ");
            heights[i] = input.nextDouble();
            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            weights[i] = input.nextDouble();
        }

        // Calculate BMI and determine status
        for (int i = 0; i < numPersons; i++) {
            bmis[i] = weights[i] / (heights[i] * heights[i]);
            if (bmis[i] <= 18.4) {
                statuses[i] = "Underweight";
            } else if (bmis[i] <= 24.9) {
                statuses[i] = "Normal";
            } else if (bmis[i] <= 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }

        // Display the results
        System.out.println("\nHeight\tWeight\tBMI\tStatus");
        for (int i = 0; i < numPersons; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s\n", heights[i], weights[i], bmis[i], statuses[i]);
        }
        input.close();
    }
}
