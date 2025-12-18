import java.util.Scanner;
public class GreatestFactor {
    public static void main(String[] args) {
        // Create Scanner object to take inputs from user
        Scanner input = new Scanner(System.in);

        // Input an integer number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Iterate to find the greatest factor
        int greatestFactor = 1;
        int i = number - 1; // Initialize counter
        while(i >= 1) {
            if (number % i == 0) {
                greatestFactor = i;
                break; // if found, break the loop
            }
            i--; // Decrement counter
        }

        // Display the greatest factor
        System.out.println("The greatest factor of " + number + " beside itself is: " + greatestFactor);
        input.close(); // Close Scanner object
    }
}
