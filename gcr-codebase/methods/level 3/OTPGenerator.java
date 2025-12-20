public class OTPGenerator {
    // Method to generate a 6-digit OTP using Math.random()
    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000; // Generates a number between 100000 and 999999
    }

    // Method to check if OTPs in the array are unique manually
    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) { // If any OTP is the same as another, return false
                    return false;
                }
            }
        }
        return true; // If no duplicates found, return true
    }

    public static void main(String[] args) {
        // Array to store 10 generated OTPs
        int[] otps = new int[10];

        // Generate 10 OTPs and store them in the array
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
        }

        // Print all generated OTPs
        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }

        // Check if all OTPs are unique manually
        boolean unique = areOTPsUnique(otps);
        System.out.println("\nAre all OTPs unique? " + unique);
    }
}
