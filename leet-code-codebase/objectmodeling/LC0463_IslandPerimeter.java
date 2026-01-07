import java.util.Scanner;

public class LC0463_IslandPerimeter {

    // Calculates perimeter of the island
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    perimeter += 4;

                    if (i > 0 && grid[i - 1][j] == 1)
                        perimeter -= 2;
                    if (j > 0 && grid[i][j - 1] == 1)
                        perimeter -= 2;
                }
            }
        }

        return perimeter;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0463_IslandPerimeter sol = new LC0463_IslandPerimeter();

        System.out.print("Enter rows: ");
        int rows = input.nextInt();

        System.out.print("Enter columns: ");
        int cols = input.nextInt();

        int[][] grid = new int[rows][cols];
        System.out.println("Enter grid values:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = input.nextInt();
            }
        }

        System.out.println(sol.islandPerimeter(grid));

        input.close();
    }
}
