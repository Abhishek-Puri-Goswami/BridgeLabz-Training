import java.util.Random;
public class MatrixOperationsV2 {
    // Method to create a random matrix
    public static int[][] createRandomMatrix(int rows, int cols) {
        Random random = new Random();
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(10); // 0 to 9
            }
        }
        return matrix;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to find transpose of a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    // Method to find determinant of 2x2 matrix
    public static int determinant2X2(int[][] matrix) {
        return (matrix[0][0] * matrix[1][1])
             - (matrix[0][1] * matrix[1][0]);
    }

    // Method to find determinant of 3x3 matrix
    public static int determinant3X3(int[][] matrix) {
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
             - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
             + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }

    // Method to find inverse of 2x2 matrix
    public static double[][] inverse2X2(int[][] matrix) {
        int det = determinant2X2(matrix);
        if (det == 0) {
            System.err.println("Inverse does not exist (Determinant = 0)");
            System.exit(0);
        }
        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / (double) det;
        inverse[0][1] = -matrix[0][1] / (double) det;
        inverse[1][0] = -matrix[1][0] / (double) det;
        inverse[1][1] = matrix[0][0] / (double) det;
        return inverse;
    }

    public static void main(String[] args) {
        int[][] matrix = createRandomMatrix(2, 2);

        System.out.println("Original Matrix:");
        displayMatrix(matrix);

        System.out.println("\nTranspose:");
        displayMatrix(transposeMatrix(matrix));

        int det = determinant2X2(matrix);
        System.out.println("\nDeterminant: " + det);

        System.out.println("\nInverse:");
        double[][] inverse = inverse2X2(matrix);
        
        if (inverse != null) {
            for (int i = 0; i < inverse.length; i++) {
                for (int j = 0; j < inverse[0].length; j++) {
                    System.out.printf("%.2f ", inverse[i][j]);
                }
                System.out.println();
            }
        }
    }
}
