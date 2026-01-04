import java.util.Scanner;

public class LC0342_PowerOfFour {

    // Checks if the number is a power of four
    public boolean isPowerOfFour(int n) {

        // Must be positive and power of two
        if (n <= 0 || (n & (n - 1)) != 0) {
            return false;
        }

        // Only one bit set at even position
        return (n & 0x55555555) != 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0342_PowerOfFour sol = new LC0342_PowerOfFour();

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        System.out.println(sol.isPowerOfFour(n));

        input.close();
    }
}
