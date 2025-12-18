import java.util.Scanner;
public class FactorsOfNumberV2 {
    public static void main(String[] args) {
        // Create Scanner object to take inputs from user
        Scanner input = new Scanner(System.in);

        // Input an integer number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.print("Factors of " + number + " are: ");
        // Iterate to find the factors
        int i = 1; // Initialize counter
        while(i < number) {
            if (number % i == 0) {
                // Print the factor
                System.out.print(i + " ");
            }
            i++; // Increment counter
        }
	input.close(); // Close Scanner object
    }
}
