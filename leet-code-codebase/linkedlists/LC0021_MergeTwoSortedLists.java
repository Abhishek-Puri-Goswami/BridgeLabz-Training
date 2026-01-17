import java.util.Scanner;

public class LC0021_MergeTwoSortedLists {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Merges two sorted linked lists
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        // Compare nodes and link smaller one
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }

        // Attach remaining nodes
        if (l1 != null)
            curr.next = l1;
        if (l2 != null)
            curr.next = l2;

        return dummy.next;
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
        LC0021_MergeTwoSortedLists sol = new LC0021_MergeTwoSortedLists();

        System.out.print("Enter size of first list: ");
        int n1 = input.nextInt();
        System.out.println("Enter first list values:");
        ListNode l1 = sol.createList(n1, input);

        System.out.print("Enter size of second list: ");
        int n2 = input.nextInt();
        System.out.println("Enter second list values:");
        ListNode l2 = sol.createList(n2, input);

        ListNode merged = sol.mergeTwoLists(l1, l2);

        sol.printList(merged);

        input.close();
    }
}
