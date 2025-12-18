import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        // Create Scanner object to take inputs from user
        Scanner input = new Scanner(System.in);

        // Input an integer number
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        int count = 0; // Initialize digit count
        // Special case, number is zero
        if (number == 0) {
            count = 1;
        } else {
            // Iterate to count digits
            while (number != 0) {
                number /= 10;  // Remove last digit
                count++;       // Increment digit count
            }
        }

        // Display the number of digits
        System.out.println("The number has " + count + " digits.");
        input.close(); // Close Scanner object
    }
}
