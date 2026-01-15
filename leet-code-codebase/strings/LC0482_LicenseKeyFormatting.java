import java.util.Scanner;

public class LC0482_LicenseKeyFormatting {

    // Formats the license key string
    public String licenseKeyFormatting(String s, int k) {
        String cleaned = "";

        // Remove dashes and convert to uppercase
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '-') {
                cleaned += Character.toUpperCase(s.charAt(i));
            }
        }

        String result = "";
        int count = 0;

        // Build from end with groups of size k
        for (int i = cleaned.length() - 1; i >= 0; i--) {
            result = cleaned.charAt(i) + result;
            count++;

            if (count == k && i != 0) {
                result = "-" + result;
                count = 0;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0482_LicenseKeyFormatting sol = new LC0482_LicenseKeyFormatting();

        System.out.print("Enter license key: ");
        String s = input.nextLine();

        System.out.print("Enter group size k: ");
        int k = input.nextInt();

        System.out.println(sol.licenseKeyFormatting(s, k));

        input.close();
    }
}
