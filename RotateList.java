public class RotateList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 2;
        ListNode rotatedList = rotateRight(head, k);
<<<<<<< HEAD
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


=======
        printList(rotatedList);
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        int len = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            len++;
        }

        k = k % len;
        if (k == 0) return head;

        tail.next = head;

        for (int i = 0; i < len - k - 1; i++) {
            head = head.next;
        }

        ListNode newHead = head.next;
        head.next = null;
        return newHead;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
>>>>>>> 99647dd (Clean commit after removing corruption)
