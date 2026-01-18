import java.util.Scanner;

public class LC0142_LinkedListCycleII {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Finds the node where the cycle begins
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // Detect if cycle exists
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                break;
            }
        }

        // No cycle
        if (fast == null || fast.next == null) {
            return null;
        }

        // Find cycle start
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

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
        LC0142_LinkedListCycleII sol = new LC0142_LinkedListCycleII();

        System.out.print("Enter number of nodes: ");
        int n = input.nextInt();

        System.out.println("Enter node values:");
        ListNode head = sol.createList(n, input);

        ListNode cycleStart = sol.detectCycle(head);

        if (cycleStart != null) {
            System.out.println(cycleStart.val);
        } else {
            System.out.println("No cycle");
        }

        input.close();
    }
}
