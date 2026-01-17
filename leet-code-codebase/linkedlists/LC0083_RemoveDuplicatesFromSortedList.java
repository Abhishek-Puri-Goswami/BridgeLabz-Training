import java.util.Scanner;

public class LC0083_RemoveDuplicatesFromSortedList {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Removes duplicate nodes from a sorted linked list
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;

        // Compare current node with next node
        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }

        return head;
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

    // Prints linked list
    private void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0083_RemoveDuplicatesFromSortedList sol = new LC0083_RemoveDuplicatesFromSortedList();

        System.out.print("Enter number of nodes: ");
        int n = input.nextInt();

        System.out.println("Enter sorted node values:");
        ListNode head = sol.createList(n, input);

        ListNode result = sol.deleteDuplicates(head);

        sol.printList(result);

        input.close();
    }
}
