import java.util.Scanner;

public class LC0605_CanPlaceFlowers {

    // Checks if flowers can be placed without adjacency
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        for (int i = 0; i < flowerbed.length && n > 0; i++) {
            if (flowerbed[i] == 0) {
                boolean leftEmpty = (i == 0) || flowerbed[i - 1] == 0;
                boolean rightEmpty = (i == flowerbed.length - 1) || flowerbed[i + 1] == 0;

                if (leftEmpty && rightEmpty) {
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }

        return n == 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0605_CanPlaceFlowers sol = new LC0605_CanPlaceFlowers();

        System.out.print("Enter flowerbed size: ");
        int size = input.nextInt();

        int[] flowerbed = new int[size];
        System.out.println("Enter flowerbed values:");
        for (int i = 0; i < size; i++) {
            flowerbed[i] = input.nextInt();
        }

        System.out.print("Enter number of flowers to place: ");
        int n = input.nextInt();

        System.out.println(sol.canPlaceFlowers(flowerbed, n));

        input.close();
    }
}
