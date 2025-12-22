import java.util.Scanner;
public class StringLength {
	// Method to find the length of the string
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

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Input a string from user
		String text = input.next();

		// Store the results
		int result1 = findStringLength(text);
		int result2 = text.length();

		// Display the results
		System.out.println("Length of the string using user-defined method: " + result1);
		System.out.println("Length of the string using built-in method: " + result2);
		input.close();
	}
}