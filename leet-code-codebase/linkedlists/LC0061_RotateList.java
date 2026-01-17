import java.util.Scanner;

public class LC0061_RotateList {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Rotates the list to the right by k places
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;

        ListNode curr = head;
        int length = 1;

        // Find length and last node
        while (curr.next != null) {
            curr = curr.next;
            length++;
        }

        // Make circular
        curr.next = head;

        k = k % length;
        int stepsToNewHead = length - k;

        // Find new tail
        while (stepsToNewHead-- > 0) {
            curr = curr.next;
        }

        ListNode newHead = curr.next;
        curr.next = null;

        return newHead;
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
        LC0061_RotateList sol = new LC0061_RotateList();

        System.out.print("Enter number of nodes: ");
        int n = input.nextInt();

        System.out.println("Enter node values:");
        ListNode head = sol.createList(n, input);

        System.out.print("Enter k: ");
        int k = input.nextInt();

        ListNode result = sol.rotateRight(head, k);

        sol.printList(result);

        input.close();
    }
}
