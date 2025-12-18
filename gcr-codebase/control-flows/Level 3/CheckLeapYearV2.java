import java.util.Scanner;
public class CheckLeapYearV2 {
    public static void main(String[] args) {
        // Create Scanner object to take inputs from user
        Scanner input = new Scanner(System.in);

        // input a year from user
        System.out.print("Enter a year (>= 1582): ");
        int year = input.nextInt();

        // Check if the year is valid
        if (year < 1582) {
            System.out.println("The year must be 1582 or later. Please enter a valid year.");
        } else {
            // Leap year using single condition (&& or ||)
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year.");
            } 
            // Not a leap year
            else {
                System.out.println(year + " is not a Leap Year.");
            }
        }
        input.close(); // Close Scanner object
    }
}
