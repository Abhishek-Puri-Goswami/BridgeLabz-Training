import java.util.Scanner;

public class LC0832_FlippingAnImage {

    // Flips the image horizontally and then inverts it
    public int[][] flipAndInvertImage(int[][] image) {
        int rows = image.length;
        int cols = image[0].length;

        // Process each row
        for (int i = 0; i < rows; i++) {
            int left = 0;
            int right = cols - 1;

            // Flip and invert at the same time
            while (left <= right) {
                int temp = image[i][left] ^ 1;
                image[i][left] = image[i][right] ^ 1;
                image[i][right] = temp;

                left++;
                right--;
            }
        }

        return image;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0832_FlippingAnImage sol = new LC0832_FlippingAnImage();

        System.out.print("Enter number of rows: ");
        int r = input.nextInt();

        System.out.print("Enter number of columns: ");
        int c = input.nextInt();

        int[][] image = new int[r][c];
        System.out.println("Enter image values (0 or 1):");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                image[i][j] = input.nextInt();
            }
        }

        int[][] result = sol.flipAndInvertImage(image);

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        input.close();
    }
}
