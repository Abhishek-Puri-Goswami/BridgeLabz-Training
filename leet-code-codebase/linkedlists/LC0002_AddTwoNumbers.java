import java.util.Scanner;

public class LC0002_AddTwoNumbers {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Adds two numbers represented by linked lists
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;

        // Add digits one by one
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            curr.next = new ListNode(sum % 10);
            carry = sum / 10;
            curr = curr.next;
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
        LC0002_AddTwoNumbers sol = new LC0002_AddTwoNumbers();

        System.out.print("Enter size of first number: ");
        int n1 = input.nextInt();
        System.out.println("Enter digits of first number:");
        ListNode l1 = sol.createList(n1, input);

        System.out.print("Enter size of second number: ");
        int n2 = input.nextInt();
        System.out.println("Enter digits of second number:");
        ListNode l2 = sol.createList(n2, input);

        ListNode result = sol.addTwoNumbers(l1, l2);

        sol.printList(result);

        input.close();
    }
}
