import java.util.Scanner;
import java.util.HashSet;

public class LC0705_DesignHashSet {

    HashSet<Integer> set;

    // Constructor
    public LC0705_DesignHashSet() {
        set = new HashSet<>();
    }

    // Adds value into set
    public void add(int key) {
        set.add(key);
    }

    // Removes value from set
    public void remove(int key) {
        set.remove(key);
    }

    // Checks if value exists
    public boolean contains(int key) {
        return set.contains(key);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0705_DesignHashSet obj = new LC0705_DesignHashSet();

        System.out.print("Enter number of operations: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter operation (1 add, 2 remove, 3 contains): ");
            int op = input.nextInt();

            if (op == 1) {
                int val = input.nextInt();
                obj.add(val);
            } else if (op == 2) {
                int val = input.nextInt();
                obj.remove(val);
            } else if (op == 3) {
                int val = input.nextInt();
                System.out.println(obj.contains(val));
            }
        }

        input.close();
    }
}
