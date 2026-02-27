package Heaps;

import java.util.*;
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class Solution {
    public ListNode mergeKSortedLists(ListNode[] lists) {
        List<Integer> allValues = new ArrayList<>();

       for (ListNode head : lists) {
            while (head != null) {
                allValues.add(head.val);
                head = head.next;
            }
        }

        Collections.sort(allValues);

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

       for (int val : allValues) {
            curr.next = new ListNode(val);
            curr = curr.next;
        }

        return dummy.next;
    }
}

class Main {
    public static void main(String[] args) {
       ListNode a = new ListNode(1);
        a.next = new ListNode(4);
        a.next.next = new ListNode(5);

        ListNode b = new ListNode(1);
        b.next = new ListNode(3);
        b.next.next = new ListNode(4);

        ListNode c = new ListNode(2);
        c.next = new ListNode(6);

        ListNode[] lists = new ListNode[]{a, b, c};

        Solution sol = new Solution();
        ListNode result = sol.mergeKSortedLists(lists);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}

