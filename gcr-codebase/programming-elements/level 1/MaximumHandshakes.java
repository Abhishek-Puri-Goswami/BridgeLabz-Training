import java.util.Scanner;
public class MaximumHandshakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long numberOfStudents;
        long maxHandshakes;
	
        //Input and calculation
        numberOfStudents = input.nextLong();
        maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

	//displaying the results
        System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is " + maxHandshakes);
	input.close(); //Closing the Scanner object
    }
}