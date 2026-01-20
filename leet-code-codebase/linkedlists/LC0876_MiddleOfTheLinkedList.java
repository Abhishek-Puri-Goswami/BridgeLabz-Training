import java.util.Scanner;

public class LC0876_MiddleOfTheLinkedList {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Finds the middle node of the linked list
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // Fast moves two steps, slow moves one
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Creates linked list from input
    private ListNode createList(int n, Scanner input) {
        if (n == 0) return null;

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
        LC0876_MiddleOfTheLinkedList sol = new LC0876_MiddleOfTheLinkedList();

        System.out.print("Enter number of nodes: ");
        int n = input.nextInt();

        System.out.println("Enter node values:");
        ListNode head = sol.createList(n, input);

        ListNode middle = sol.middleNode(head);

        sol.printList(middle);

        input.close();
    }
}
