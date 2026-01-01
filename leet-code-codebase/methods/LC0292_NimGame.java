import java.util.Scanner;
public class LC0292_NimGame {
    // Checks if the first player can win the Nim game
    public boolean canWinNim(int n) {
        // Player loses only when n is multiple of 4
        return n % 4 != 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0292_NimGame sol = new LC0292_NimGame();

        System.out.print("Enter number of stones: ");
        int n = input.nextInt();

        System.out.println(sol.canWinNim(n));
        input.close();
    }
}
