import java.util.Scanner;

public class LC0141_LinkedListCycle {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Checks if the linked list has a cycle
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // Move slow by 1 and fast by 2
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    // Creates linked list from input
    private ListNode createList(int n, Scanner input) {
        if (n == 0)
            return null;

        ListNode head = new ListNode(input.nextInt());
        ListNode curr = head;

        for (int i = 1; i < n; i++) {
            curr.next = new ListNode(input.nextInt());
            curr = curr.next;
        }

        return head;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0141_LinkedListCycle sol = new LC0141_LinkedListCycle();

        System.out.print("Enter number of nodes: ");
        int n = input.nextInt();

        System.out.println("Enter node values:");
        ListNode head = sol.createList(n, input);

        System.out.println(sol.hasCycle(head));

        input.close();
    }
}
