import java.util.Scanner;
public class SubstringOccurrence {
    // Method to find the occurence of the substring in the main string
    public static int findOccurence(String mainString, String subString) {
        if (subString.length() == 0) {
            return 0;
        }
        int index = 0;
        int count = 0;

        while ((index = mainString.indexOf(subString, index)) != -1) {
            count++;
            index += subString.length();
        }
        // Returns the count
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.next();
        System.out.print("Enter a substring: ");
        String subStr = input.next();

        // store number of occurrences of given substring in a string
        int count = findOccurence(str, subStr);

        // Display the count
        System.out.println("The substring occurs " + count + " times in the string.");
        input.close();
    }
}