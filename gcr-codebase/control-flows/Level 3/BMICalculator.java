import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        // Create Scanner object to take inputs from user
        Scanner input = new Scanner(System.in);

        // Input weight and height values
        System.out.print("Enter weight (in kg): ");
        double weight = input.nextDouble();
        System.out.print("Enter height (in cm): ");
        double heightCentimetres = input.nextDouble();

        // Convert height from centimetres to metres
        double heightMetres = heightCentimetres / 100;
        // Calculate BMI
        double bmi = weight / (heightMetres * heightMetres);
        
        // Determine the weight status based on BMI
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            status = "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Display the result
        System.out.println("BMI: " + bmi);
        System.out.println("Weight Status: " + status);
        input.close(); // Close Scanner object
    }
}
