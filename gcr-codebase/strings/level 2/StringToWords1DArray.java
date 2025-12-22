import java.util.Scanner;
public class StringToWords1DArray {
	// Method to find the length of the string manually
	public static int findStringLength(String str) {
		int count = 0;
		try {
			while (true) {
				str.charAt(count);
				count++;
			}
		} catch (IndexOutOfBoundsException e) {
			// Exception indicates end of the string
			return count;
		}
	}

	// Method to split text into words
	public static String[] splitTextIntoWords(String text) {
		int length = findStringLength(text);
		int wordCount = 0;
		// Count white spaces
		for (int i = 0; i < length; i++) {
			if (text.charAt(i) == ' ') {
				wordCount++;
			}
		}
		wordCount++;

		// Fill white space index in the array
		int[] spaceIndices = new int[wordCount - 1];
		int index = 0;
		for (int i = 0; i < length; i++) {
			if (text.charAt(i) == ' ') {
				spaceIndices[index++] = i;
			}
		}

		String[] words = new String[wordCount];
		int start = 0;
		for (int i = 0; i < wordCount - 1; i++) {
			words[i] = text.substring(start, spaceIndices[i]);
			start = spaceIndices[i] + 1;
		}
		words[wordCount - 1] = text.substring(start);
		return words;
	}

	public static boolean compareStringArrays(String[] words1, String[] words2) {
		if (words1.length != words2.length) {
			return false;
		}

		for (int i = 0; i < words1.length; i++) {
			if (!words1[i].equals(words2[i])) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Input a string
		String str = input.nextLine();

		// Store the results
		String[] result1 = splitTextIntoWords(str);
		String[] result2 = str.split(" ");

		// Compare results
		boolean isSame = compareStringArrays(result1, result2);

		// Display the results
		if (isSame) {
			System.out.println("Both the results are same.");
		} else {
			System.out.println("Both the results are not same.");
		}
		input.close();
	}
}