import java.util.Scanner;
public class LeapYear {
    // Create method to check for leap year
    public static boolean checkLeapYear(int year) {
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year  = input.nextInt();
        
        if(year < 1582) {
            System.err.println("Please enter a valid year (>= 1582).");
            System.exit(0);
        }

        boolean isLeapYear = checkLeapYear(year);
        System.out.println("The year " + year + " is a leap year? : " + isLeapYear);
       	input.close();
    }
}