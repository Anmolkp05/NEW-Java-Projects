public class InsertNodeBeforeHeadInDLL {
    public static void main(String[] args) {
        ListNode head = new ListNode(5);
        head.next = new ListNode(10);
        head.next.prev = head;
        head.next.next = new ListNode(15);
        head.next.next.prev = head.next;

        System.out.println("Original List:");
        printList(head);

        head = insertBeforeHead(head, 3);

        System.out.println("\nList after insertion:");
        printList(head);
    }
    public static ListNode insertBeforeHead(ListNode head, int X) {
        ListNode newNode = new ListNode(X);
        if (head == null) {
            return newNode;
        }

        newNode.next = head;

        head.prev = newNode;

        return newNode;



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
