import java.util.Scanner;
public class FactorsOfNumber {
    public static void main(String[] args) {
        // Create Scanner object to take inputs from user
        Scanner input = new Scanner(System.in);

        // Input an integer number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.print("Factors of " + number + " are: ");
        // Iterate to find the factors
        for(int i = 1; i < number; i++) {
            if (number % i == 0) {
                // Print the factor
                System.out.print(i + " ");
            }
        }
	input.close(); // Close Scanner object
    }
}
