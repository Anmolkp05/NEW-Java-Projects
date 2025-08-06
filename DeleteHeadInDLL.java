public class DeleteHeadInDLL {
    public static void main(String[] args) {
        ListNode head = new ListNode(5);
        head.next = new ListNode(10);
        head.next.prev = head;
        head.next.next = new ListNode(15);
        head.next.next.prev = head.next;

        System.out.println("Original List:");
        printList(head);

        head = deleteHead(head);

        System.out.println("\nList after deleting the head:");
        printList(head);
    }

    public static ListNode deleteHead(ListNode head) {
        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return null;
        }

        head = head.next;

        head.prev = null;

        return head;
    }

   public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode prev;

        ListNode(int x) {
            val = x;
            next = null;
            prev = null;
        }
    }
}
