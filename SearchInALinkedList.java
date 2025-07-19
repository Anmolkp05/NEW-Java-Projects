public class SearchInALinkedList {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);

        int target = 20;

        boolean found = search(head, target);
        System.out.println("Value " + target + " found: " + found);
    }

    public static boolean search(ListNode head, int target) {
        while (head != null) {
            if (head.val == target) {
                return true;
            }
            head = head.next;
        }
        return false;
    }
}
