import java.util.Scanner;
public class TwoDToOneD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Input the number of rows and columns
        int rows = input.nextInt();
        int cols = input.nextInt();
        // Declare a 2D array
        int[][] matrix = new int[rows][cols];
        // Input elements in 2D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }

        // Declare a 1D array
        int[] oneDArray = new int[rows * cols];
        int index = 0;
        // Copy elements from the 2D array to the 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                oneDArray[index] = matrix[i][j];
                index++;  // Increment index for the 1D array
            }
        }

        // Display 1D array elements
        for (int i = 0; i < oneDArray.length; i++) {
            System.out.print(oneDArray[i] + " ");
        }
        input.close();
    }
}
