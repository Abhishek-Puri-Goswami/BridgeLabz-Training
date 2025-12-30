import java.util.Scanner;
public class LC0191_NumberOf1Bits {
    // Counts number of set bits (1s) in binary representation
    public int hammingWeight(int n) {
        int count = 0;

        // Check each bit using bitwise AND
        while (n != 0) {
            count += (n & 1);
            n = n >>> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0191_NumberOf1Bits sol = new LC0191_NumberOf1Bits();

        System.out.print("Enter an integer: ");
        int n = input.nextInt();

        System.out.println(sol.hammingWeight(n));
        input.close();
    }
}
