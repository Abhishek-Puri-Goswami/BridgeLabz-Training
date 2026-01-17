import java.util.Scanner;

public class LC0024_SwapNodesInPairs {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Swaps every two adjacent nodes
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;

        // Swap nodes in pairs
        while (prev.next != null && prev.next.next != null) {
            ListNode first = prev.next;
            ListNode second = first.next;

            first.next = second.next;
            second.next = first;
            prev.next = second;

            prev = first;
        }

        return dummy.next;
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

    private void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0024_SwapNodesInPairs sol = new LC0024_SwapNodesInPairs();

        System.out.print("Enter number of nodes: ");
        int n = input.nextInt();

        System.out.println("Enter node values:");
        ListNode head = sol.createList(n, input);

        ListNode result = sol.swapPairs(head);

        sol.printList(result);

        input.close();
    }
}
