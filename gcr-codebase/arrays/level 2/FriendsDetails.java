import java.util.Scanner;
public class FriendsDetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input friends age and height
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter " + names[i] + "'s age: ");
            ages[i] = input.nextInt();
            System.out.print("Enter " + names[i] + "'s height (in cm): ");
            heights[i] = input.nextDouble();
        }
        // Find the youngest friend
        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }
        // Find the tallest friend
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display the results
        System.out.println(names[youngestIndex] + " is the youngest friend.");
        System.out.println(names[tallestIndex] + " is the tallest friend.");
        input.close();
    }
}
