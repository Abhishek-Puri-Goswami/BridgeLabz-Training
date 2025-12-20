import java.util.Scanner;
public class SpringSeason {
    // Create method to check whether it is spring season
    public static boolean checkSpringSeason(int month, int day) {
        if(3 <= month && month <= 6) {
            if((month == 3 && day < 20) || (month == 6 && day > 20)) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        // Input the month and day values
        if(args.length == 0) {
            System.err.println("Please enter valid command-line arguments");
            System.exit(0);
        }
        int month = Integer.valueOf(args[0]);
        int day = Integer.valueOf(args[1]);

        boolean isSpring = checkSpringSeason(month, day);
        System.out.println("Spring season: " + isSpring);
    }
}