import java.util.Scanner;
public class AnagramStrings {
    public static boolean checkAnagramStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        String temp1 = str1.toLowerCase();
        String temp2 = str2.toLowerCase();

        int[] arr1 = new int[256];
        int[] arr2 = new int[256];

        for (int i = 0; i < str1.length(); i++) {
            char ch1 = temp1.charAt(i);
            char ch2 = temp2.charAt(i);

            arr1[ch1]++;
            arr2[ch2]++;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (arr1[temp1.charAt(i)] != arr2[temp1.charAt(i)]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str1 = input.nextLine();
        System.out.println("Enter the second string");
        String str2 = input.nextLine();

        boolean result = checkAnagramStrings(str1, str2);
        System.out.println("The strings are anagrams: " + result);
        input.close();
    }
}
