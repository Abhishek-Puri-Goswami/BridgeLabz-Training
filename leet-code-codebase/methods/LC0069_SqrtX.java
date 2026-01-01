import java.util.Scanner;
public class LC0069_SqrtX {
    // Returns the integer square root of x
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }

        int left = 1;
        int right = x / 2;
        int ans = 0;

        // Binary search for square root
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long square = (long) mid * mid;

            if (square == x) {
                return mid;
            } else if (square < x) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0069_SqrtX sol = new LC0069_SqrtX();

        System.out.print("Enter a number: ");
        int x = input.nextInt();

        System.out.println(sol.mySqrt(x));
        input.close();
    }
}
