import java.util.Scanner;

public class LC0367_ValidPerfectSquare {

    // Checks whether the given number is a perfect square
    public boolean isPerfectSquare(int num) {
        long left = 1;
        long right = num;

        // Binary search to find square root
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;

            if (square == num) {
                return true;
            } else if (square > num) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0367_ValidPerfectSquare sol = new LC0367_ValidPerfectSquare();

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        System.out.println(sol.isPerfectSquare(num));

        input.close();
    }
}
