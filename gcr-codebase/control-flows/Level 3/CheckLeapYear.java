import java.util.Scanner;
public class CheckLeapYear {
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
            // Part 1 - Using multiple if-else statements
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " is a Leap Year.");
                    } else {
                        System.out.println(year + " is not a Leap Year.");
                    }
                } else {
                    System.out.println(year + " is a Leap Year.");
                }
            } else {
                System.out.println(year + " is not a Leap Year.");
            }

            // Part 2 - Using a single if statement with logical conditions
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year." + "[Single Condition]");
            } else {
                System.out.println(year + " is NOT a Leap Year." + "[Single Condition]");
            }
        }
        input.close(); // Close Scanner object
    }
}
