package neetcode._6LinkedList;

import java.util.HashSet;

@SuppressWarnings("unused")
public class _3LLCycleDetection {
    private boolean hasCycleHashSet(ListNode head) {
        HashSet<ListNode> seen = new HashSet<>();
        ListNode curr = head;
        while (curr != null) {
            if (seen.contains(curr)) return true;
            seen.add(curr);
            curr = curr.next;
        }
        return false;
    }
    // TC : O(n)
    // Sc : O(n)
    private boolean hasCycleFastSlowOptimized(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) return true;
        }
        return false;
    }
    // TC : O(n)
    // SC : O(1)
}
