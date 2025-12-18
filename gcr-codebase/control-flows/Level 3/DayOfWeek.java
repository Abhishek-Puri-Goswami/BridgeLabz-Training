public class DayOfWeek {
    public static void main(String[] args) {
        // Check if command-line arguments are valid
        if(args.length != 3) {
            System.out.println("Please enter valid command-line arguments");
            return;
        }
        // Input month, day, and year from command line arguments
        int d = Integer.parseInt(args[0]); // day (1-31)
        int m = Integer.parseInt(args[1]); // month (1-12)
        int y = Integer.parseInt(args[2]); // year (1587 0r later)
        
        // Apply the given Gregorian calendar formulas
        int y0 = y - (14 - m) / 12;                // Calculate year y0
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400; // Calculate year x  
        int m0 = m + 12 * ((14 - m) / 12) - 2;     // Calculate month m0
        int d0 = (d + x + 31 * m0 / 12) % 7;       // Calculate day d0
        
        // Display the day of the week
        String dayOfWeek;
        switch(d0) {
            case 0: dayOfWeek = "Sunday";
                    break;
            case 1: dayOfWeek = "Monday";
                    break;
            case 2: dayOfWeek = "Tuesday";
                    break;
            case 3: dayOfWeek = "Wednesday";
                    break;
            case 4: dayOfWeek = "Thursday";
                    break;
            case 5: dayOfWeek = "Friday";
                    break;
            case 6: dayOfWeek = "Saturday";
                    break;
            default: dayOfWeek = "Invalid";
        }
        System.out.print("The day of the week is: " + dayOfWeek);
    }
}
