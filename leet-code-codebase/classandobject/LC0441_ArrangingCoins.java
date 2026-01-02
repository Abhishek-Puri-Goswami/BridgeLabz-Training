import java.util.Scanner;

public class LC0441_ArrangingCoins {

    // Finds number of complete staircase rows
    public int arrangeCoins(int n) {
        int row = 0;

        // Subtract coins row by row
        while (n >= row + 1) {
            row++;
            n -= row;
        }

        return row;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0441_ArrangingCoins sol = new LC0441_ArrangingCoins();

        System.out.print("Enter number of coins: ");
        int n = input.nextInt();

        System.out.println(sol.arrangeCoins(n));

        input.close();
    }
}
