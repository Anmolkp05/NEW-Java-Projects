public class RotateList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 2;
        ListNode rotatedList = rotateRight(head, k);
        RemoveLinkedListElement.printList(rotatedList);
    }
    public static ListNode rotateRight(ListNode head, int k) {
        if(head == null) {
            return head;
        }

        int len=1;
        ListNode newH, tail;
        newH=tail=head;

        while(tail.next != null)
        {
            tail = tail.next;
            len++;
        }
        tail.next = head;

        k = k % len;

        for(int i=0; i<len-k; i++) tail = tail.next;
        newH = tail.next;
        tail.next = null;
        return newH;
    }
}


