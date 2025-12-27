import java.util.Scanner;

public class LC0657_RobotReturnToOrigin {
    // Determines if robot returns to origin after executing moves
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;

        // Update position based on each move
        for (char move : moves.toCharArray()) {
            if (move == 'U')
                y++;
            else if (move == 'D')
                y--;
            else if (move == 'L')
                x--;
            else if (move == 'R')
                x++;
        }

        // Robot returns to origin if both coordinates are zero
        return x == 0 && y == 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter moves string: ");
        String moves = input.nextLine();

        LC0657_RobotReturnToOrigin obj = new LC0657_RobotReturnToOrigin();
        System.out.println(obj.judgeCircle(moves));

        input.close();
    }
}