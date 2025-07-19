public class InsertionAtTheHeadOfLinkedList {

     static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);

        System.out.print("Original List: ");
        printList(head);

        head = insertAtHead(head, 5);

        System.out.print("After Insertion at Head: ");
        printList(head);
    }

    public static ListNode insertAtHead(ListNode head, int X) {
        ListNode newNode = new ListNode(X);
        newNode.next = head;
        return newNode;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
}
