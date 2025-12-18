import java.util.Scanner;
public class MultiplesBelow100 {
    public static void main(String[] args) {
        // Create Scanner object to take inputs from user
        Scanner input = new Scanner(System.in);

        // Input an integer number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check number is positive and less than 100
        if(number < 0 || number >= 100) {
            System.out.println("Please enter positive integer less than 100.");
            return;
        }

        // Iterate from 100 to 1
        System.out.print("Multiples of " + number + " below 100 are: ");
        for(int i = 100; i >= 1; i--) {
            if (i % number != 0) {
                continue;
            }
            // Print the multiple
            System.out.print(i + " ");
        }
        input.close(); // Close Scanner object
    }
}
