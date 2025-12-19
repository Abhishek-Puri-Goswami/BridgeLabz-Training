import java.util.Scanner;
public class MeanHeight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Declare array to store heights of football players
        double[] heights = new double[11];
        // Input the heights of players
        for(int i = 0; i < heights.length; i++) {
            heights[i] = input.nextDouble();
        } 
	
        // Calculate sum of all heights
        double sumHeights = 0.0;
        for(int i = 0; i < heights.length; i++) {
            sumHeights += heights[i];
        }
	
        // Display the mean height
        System.out.printf("Mean height : %.2f", (sumHeights / heights.length));     
	input.close();
    }
}