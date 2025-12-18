// Create SpringSeason class to check if the season is spring from month and day values.
import java.util.Scanner;
public class SpringSeason  {
    public static void main(String[] args) {
        // Input the month and day values
        if(args.length == 0) {
            System.out.println("Please enter valid command-line arguments");
            return;
        }
        int month = Integer.valueOf(args[0]);
        int day = Integer.valueOf(args[1]);

        // Display whether this is spring season or not
        if(3 <= month && month <= 6) {
            if(month == 3 && day < 20) {
                System.out.println("Not a Spring Season");
            } else if(month == 6 && day > 20) {
                System.out.println("Not a Spring Season");
            } else {
                System.out.println("It's a Spring Season");
            }
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}