import java.util.Scanner;

public class LC0374_GuessNumberHigherOrLower {

    int pick;

    // Simulates guess API
    private int guess(int num) {
        if (num > pick)
            return -1;
        if (num < pick)
            return 1;
        return 0;
    }

    // Finds the picked number using binary search
    public int guessNumber(int n) {
        int left = 1;
        int right = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int result = guess(mid);

            if (result == 0) {
                return mid;
            } else if (result < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0374_GuessNumberHigherOrLower sol = new LC0374_GuessNumberHigherOrLower();

        System.out.print("Enter range n: ");
        int n = input.nextInt();

        System.out.print("Enter picked number: ");
        sol.pick = input.nextInt();

        System.out.println(sol.guessNumber(n));

        input.close();
    }
}
