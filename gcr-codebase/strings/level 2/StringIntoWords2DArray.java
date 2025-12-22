import java.util.Scanner;
public class StringIntoWords2DArray {
    // Method to find the length of a string
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

    // Method to split text into words without using split()
    public static String[] splitTextIntoWords(String text) {
        int length = findStringLength(text);
        int wordCount = 0;

        // Count words by identifying spaces
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        wordCount++;

        // Store indices of spaces
        int[] spaceIndexes = new int[wordCount - 1];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }

        // Extract words using space indices
        String[] words = new String[wordCount];
        int start = 0;
        for (int i = 0; i < wordCount - 1; i++) {
            words[i] = text.substring(start, spaceIndexes[i]);
            start = spaceIndexes[i] + 1;
        }
        words[wordCount - 1] = text.substring(start);
        return words;
    }

    // Method to generate a 2D array of words and their lengths
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] wordLengths = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordLengths[i][0] = words[i];
            wordLengths[i][1] = String.valueOf(findStringLength(words[i]));
        }
        return wordLengths;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Take user input using nextLine()
        String text = input.nextLine();

        // Store the results
        String[] result1 = splitTextIntoWords(text);
        String[][] result2 = getWordsWithLengths(result1);

        // Display the results
        System.out.printf("%-15s%-10s%n", "Word", "Length");
        System.out.println("----------------------");
        for (String[] wordLength : result2) {
            System.out.printf("%-15s%-10d%n", wordLength[0], Integer.parseInt(wordLength[1]));
        }
        input.close();
    }
}
