import java.util.Scanner;

public class LC0345_ReverseVowelsOfAString {

    // Reverses only the vowels in the string
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        // Swap vowels from both ends
        while (left < right) {
            if (!isVowel(arr[left])) {
                left++;
            } else if (!isVowel(arr[right])) {
                right--;
            } else {
                char temp = arr[left];
                arr[left++] = arr[right];
                arr[right--] = temp;
            }
        }

        return new String(arr);
    }

    // Checks if a character is a vowel
    private boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0345_ReverseVowelsOfAString sol = new LC0345_ReverseVowelsOfAString();

        System.out.print("Enter a string: ");
        String s = input.nextLine();

        System.out.println(sol.reverseVowels(s));

        input.close();
    }
}
