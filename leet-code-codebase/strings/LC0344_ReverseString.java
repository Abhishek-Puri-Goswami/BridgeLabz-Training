import java.util.Scanner;

public class LC0344_ReverseString {

    // Reverses the character array using two-pointer technique
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        // Swap characters from both ends until pointers meet
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string to reverse: ");
        String str = input.nextLine();
        char[] s = str.toCharArray();

        LC0344_ReverseString obj = new LC0344_ReverseString();
        obj.reverseString(s);

        System.out.println("Reversed string: " + new String(s));

        input.close();
    }
}