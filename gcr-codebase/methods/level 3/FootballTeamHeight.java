import java.util.Arrays;
public class FootballTeamHeight {
    // Method to generate random heights for the players
    public static int[] generateHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = (int)(Math.random() * 101 + 150);
        }
        return heights;
    }

    // Method to find the sum of all elements in the array
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to calculate the mean height
    public static double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }

    // Method to find the shortest height
    public static int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            shortest = Math.min(shortest, height);
        }
        return shortest;
    }

    // Method to find the tallest height
    public static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            tallest = Math.max(tallest, height);
        }
        return tallest;
    }

    public static void main(String[] args) {
        // Generate heights for 11 players
        int[] heights = generateHeights(11);

        // Display the generated heights
        System.out.println("Heights of players in the football team (in cm):");
        System.out.println(Arrays.toString(heights));

        // Calculate the shortest, tallest, and mean height
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);
        double meanHeight = findMean(heights);

        // Display the results
        System.out.println("\nShortest height: " + shortest + " cm");
        System.out.println("Tallest height: " + tallest + " cm");
        System.out.println("Mean height: " + meanHeight + " cm");
    }
}
