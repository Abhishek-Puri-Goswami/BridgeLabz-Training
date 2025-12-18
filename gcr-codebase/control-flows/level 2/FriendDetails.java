import java.util.Scanner;

public class FriendDetails {
    public static void main(String[] args) {
        // Create Scanner object to take inputs from user
        Scanner input = new Scanner(System.in);

        // Input: Age and height of Amar, Akbar, and Anthony
        System.out.print("Enter Amar's age: ");
        int amarAge = input.nextInt();
        System.out.print("Enter Amar's height (in cm): ");
        double amarHeight = input.nextDouble();

        System.out.print("Enter Akbar's age: ");
        int akbarAge = input.nextInt();
        System.out.print("Enter Akbar's height (in cm): ");
        double akbarHeight = input.nextDouble();

        System.out.print("Enter Anthony's age: ");
        int anthonyAge = input.nextInt();
        System.out.print("Enter Anthony's height (in cm): ");
        double anthonyHeight = input.nextDouble();

        // Finding the youngest friend by comparing ages
        int youngestAge = amarAge;
        String youngestFriend = "Amar";
        
        if (akbarAge < youngestAge) {
            youngestAge = akbarAge;
            youngestFriend = "Akbar";
        }
        if (anthonyAge < youngestAge) {
            youngestAge = anthonyAge;
            youngestFriend = "Anthony";
        }

        // Finding the tallest friend by comparing heights
        double tallestHeight = amarHeight;
        String tallestFriend = "Amar";

        if (akbarHeight > tallestHeight) {
            tallestHeight = akbarHeight;
            tallestFriend = "Akbar";
        }
        if (anthonyHeight > tallestHeight) {
            tallestHeight = anthonyHeight;
            tallestFriend = "Anthony";
        }

        // Output the results
        System.out.println("\nYoungest Friend: " + youngestFriend + " (Age: " + youngestAge + ")");
        System.out.println("Tallest Friend: " + tallestFriend + " (Height: " + tallestHeight + " cm)");

        input.close(); // Close Scanner object
    }
}
