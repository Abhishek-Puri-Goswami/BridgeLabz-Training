import java.util.Scanner;
public class CompareTwoStrings {
    public static boolean compareStrings(String str1, String str2) {
        String temp1 = str1.toLowerCase();
        String temp2 = str2.toLowerCase();

        int index = 0;
        while (index != temp1.length() && index != temp2.length()) {
            if (temp1.charAt(index) > temp2.charAt(index)) {
                return false;
            } else if (temp1.charAt(index) < temp2.charAt(index)) {
                return true;
            }
            index++;
        }
        if (temp1.length() < temp2.length()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str1 = input.nextLine();
        System.out.println("Enter the second string: ");
        String str2 = input.nextLine();

        boolean result = compareStrings(str1, str2);
        if (result) {
            System.out.println(str1 + " comes before " + str2 + " in lexicographical order");
        } else if (result == false) {
            System.out.println(str2 + " comes before " + str1 + " in lexicographical order");
        }
        input.close();
    }
}
