import java.util.Scanner;
public class MaxHandshakes {
    public static long findMaxHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfStudents  = input.nextInt();

        long maxHandshakes = findMaxHandshakes(numberOfStudents);
        System.out.println("The number of possible handshakes is " + maxHandshakes);
       	input.close();
    }
}