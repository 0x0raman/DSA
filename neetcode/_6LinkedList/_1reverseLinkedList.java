package neetcode._6LinkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }
    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
@SuppressWarnings("unused")
public class _1reverseLinkedList {
    private static ListNode reverseListRecursive(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode newHead = reverseListRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    //TC : O(n)
    //SC : O(n) recursive call stack
    private static ListNode reverseListIterativeOptimized(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
    // TC : O(n)
    // Sc : O(1)
}
