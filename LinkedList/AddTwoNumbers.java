package LinkedList;

public class AddTwoNumbers {

    // STATIC method
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode ptr = dummy;
        int carry = 0;

        while (l1 != null || l2 != null) {

            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            ptr.next = new ListNode(sum % 10);
            ptr = ptr.next;
        }

        if (carry > 0) {
            ptr.next = new ListNode(carry);
        }

        return dummy.next;
    }

    // 🔥 MAIN METHOD (for running)
    public static void main(String[] args) {

        // Number 342 → 2 -> 4 -> 3
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));

        // Number 465 → 5 -> 6 -> 4
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        ListNode result = addTwoNumbers(l1, l2);

        System.out.print("Result: ");
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
