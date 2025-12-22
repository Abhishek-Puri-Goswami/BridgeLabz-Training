import java.util.Scanner;
public class StringTrim {
    // Method to find the length of a string without using length()
    public static int findStringLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception indicates end of the string
            return count;
        }
    }

    // Method to trim leading and trailing spaces
    public static int[] trimSpaces(String text) {
        int start = 0;
        int end = findStringLength(text) - 1;

        // Trim leading spaces
        while (start <= end && (text.charAt(start) == ' ' || text.charAt(start) == '\t')) {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && (text.charAt(end) == ' ' || text.charAt(end) == '\t')) {
            end--;
        }

        return new int[] { start, end };
    }

    // Method to create a substring using charAt()
    public static String createSubstring(String text, int startIdx, int endIdx) {
        String result = "";
        for (int i = startIdx; i <= endIdx; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String text1, String text2) {
        int length1 = findStringLength(text1);
        int length2 = findStringLength(text2);
        if (length1 != length2) {
            return false;
        }
        for(int i = 0; i < length1; i++) {
            if (text1.charAt(i) != text2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Input a string
        String text = input.nextLine();

        // Store the results
        int[] trimIndices = trimSpaces(text);
        String result1 = createSubstring(text, trimIndices[0], trimIndices[1]);
        String result2 = text.trim();
        // Compare the results
        boolean isSame = compareStrings(result1, result2);

        // Display the results
        if (isSame) {
            System.out.println("Both the results are equal.");
        } else {
            System.out.println("Both the results are not equal.");
        }
        input.close();
    }
}
