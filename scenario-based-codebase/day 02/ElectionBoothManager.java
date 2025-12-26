import java.util.Scanner;

public class ElectionBoothManager {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int candidate1 = 0, candidate2 = 0, candidate3 = 0;

        while (true) {
            System.out.print("\nEnter voter age (-1 to exit): ");
            int age = input.nextInt();

            if (age == -1) {
                break;
            }

            if (age >= 18) {
                System.out.print("Vote for candidate (1 / 2 / 3): ");
                int vote = input.nextInt();

                if (vote == 1)
                    candidate1++;
                else if (vote == 2)
                    candidate2++;
                else if (vote == 3)
                    candidate3++;
                else
                    System.out.println("Invalid vote!");
            } else {
                System.out.println("Not eligible to vote.");
            }
        }

        System.out.println("\n--- Election Result ---");
        System.out.println("Candidate 1 Votes: " + candidate1);
        System.out.println("Candidate 2 Votes: " + candidate2);
        System.out.println("Candidate 3 Votes: " + candidate3);
        input.close();
    }
}
