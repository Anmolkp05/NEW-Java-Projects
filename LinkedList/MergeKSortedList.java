package LinkedList;



public class MergeKSortedList {

    public static ListNode mergeKLists(ListNode[] lists) {

        if (lists == null || lists.length == 0) {
            return null;
        }

        ListNode result = null;

        for (ListNode list : lists) {
            result = mergeTwoLists(result, list);
        }

        return result;
    }

    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        if (l1 != null) {
            current.next = l1;
        } else {
            current.next = l2;
        }

        return dummy.next;
    }

   public static void main(String[] args) {

         ListNode l1 = new ListNode(1, new ListNode(4, new ListNode(5)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode l3 = new ListNode(2, new ListNode(6));

        ListNode[] lists = { l1, l2, l3 };

        ListNode result = mergeKLists(lists);

        System.out.print("Merged List: ");
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
