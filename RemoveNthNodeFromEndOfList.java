public class RemoveNthNodeFromEndOfList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        Solution solution = new RemoveNthNodeFromEndOfList().new Solution();
        ListNode result = solution.removeNthFromEnd(head, 2);

        System.out.print("Resulting List: ");
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            if (head == null || n <= 0) return head;  // Edge case

            ListNode dummy = new ListNode(-1);
            dummy.next = head;

            ListNode firstPtr = dummy;
            ListNode secondPtr = dummy;

            for (int i = 0; i < n; i++) {
                if (secondPtr.next == null) return head;
                secondPtr = secondPtr.next;
            }

            while (secondPtr.next != null) {
                firstPtr = firstPtr.next;
                secondPtr = secondPtr.next;
            }

            firstPtr.next = firstPtr.next.next;

            return dummy.next;
        }
    }
}
