public class RemoveLinkedListElement {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);

        System.out.println("Original List:");
        printList(head);

        int valToRemove = 6;
        head = removeElements(head, valToRemove);

        System.out.println("List after removing " + valToRemove + ":");
        printList(head);


    }


    public static ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode curr = dummy;
        while (curr.next != null) {

            if (curr.next.val == val)
                curr.next = curr.next.next;
            else
                curr = curr.next;
        }

        return dummy.next;
    }

    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
}
