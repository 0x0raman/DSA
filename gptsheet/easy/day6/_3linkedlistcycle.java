package gptsheet.easy.day6;

public class _3linkedlistcycle {
    public static class ListNode {
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

    private static ListNode createLinkedList(int... values) {
        ListNode head = null;
        ListNode current = null;
        for (int value : values) {
            if (head == null) {
                head = new ListNode(value);
                current = head;
            } else {
                current.next = new ListNode(value);
                current = current.next;
            }
        }
        return head;
    }

    // Solution ------------------------------------------------------------
    public static boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }

    // -----------------------------------------------------------------------
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = createLinkedList(1, 232, 42, 23, 12, 21, 32231, 121, 2343);
        System.out.println("Original List:");
        printList(head);
        ListNode current = head;
        // introduced a cycle last node -> second node
        while (current.next != null) {
            current = current.next;
        }
        current.next = head.next;
        System.out.println("Does th list have cycle? " + hasCycle(head));
    }
}