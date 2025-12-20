import java.util.Scanner;
public class FriendsComparison {
    // Method to find the youngest among the 3 friends
    public static String findYoungest(String[] names, int[] ages) {
        int youngestIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }
        // Return the name of the youngest friend
        return names[youngestIndex]; 
    }

    // Method to find the tallest among the 3 friends
    public static String findTallest(String[] names, double[] heights) {
        int tallestIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        // Return the name of the tallest friend
        return names[tallestIndex]; 
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Names of the friends
        String[] names = {"Amar", "Akbar", "Anthony"};
        
        // Arrays to store the ages and heights of the friends
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input ages and heights for each friend
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the age of " + names[i] + ": ");
            ages[i] = input.nextInt();

            System.out.println("Enter the height (in cm) of " + names[i] + ": ");
            heights[i] = input.nextDouble();
        }

        // Find and display the youngest friend
        String youngestFriend = findYoungest(names, ages);
        System.out.println("The youngest friend is " + youngestFriend);

        // Find and display the tallest friend
        String tallestFriend = findTallest(names, heights);
        System.out.println("The tallest friend is " + tallestFriend);
        input.close();
    }
}
