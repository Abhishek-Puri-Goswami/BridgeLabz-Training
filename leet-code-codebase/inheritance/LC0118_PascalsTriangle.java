import java.util.Scanner;

public class LC0118_PascalsTriangle {

    // Prints Pascal's Triangle up to given rows
    public void generate(int numRows) {

        int[][] triangle = new int[numRows][numRows];

        // Build triangle row by row
        for (int i = 0; i < numRows; i++) {
            triangle[i][0] = 1;

            for (int j = 1; j <= i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1]
                               + (j < i ? triangle[i - 1][j] : 0);
            }
        }

        // Print triangle
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0118_PascalsTriangle sol = new LC0118_PascalsTriangle();

        System.out.print("Enter number of rows: ");
        int numRows = input.nextInt();

        sol.generate(numRows);

        input.close();
    }
}
