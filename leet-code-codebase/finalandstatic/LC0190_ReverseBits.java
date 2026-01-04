import java.util.Scanner;

public class LC0190_ReverseBits {

    // Reverses bits of a 32-bit integer
    public int reverseBits(int n) {
        int result = 0;

        // Process all 32 bits
        for (int i = 0; i < 32; i++) {
            result = (result << 1) | (n & 1);
            n = n >>> 1;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0190_ReverseBits sol = new LC0190_ReverseBits();

        System.out.print("Enter an integer: ");
        int n = input.nextInt();

        System.out.println(sol.reverseBits(n));

        input.close();
    }
}
