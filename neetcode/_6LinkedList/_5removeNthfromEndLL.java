package neetcode._6LinkedList;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class _5removeNthfromEndLL {
    private ListNode removeNthFromEndBrute(ListNode head, int n) {
        List<ListNode> nodes = new ArrayList<>();
        ListNode cur = head;
        while (cur != null) {
            nodes.add(cur);
            cur = cur.next;
        }
        int remidx = nodes.size() - n;
        if (remidx == 0) return head.next;
        nodes.get(remidx - 1).next = nodes.get(remidx).next;
        return head;
    }
    // TC : O(n)
    // SC : O(n)

    private ListNode removeNthFromEnd2PointerOptimized(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode l = dummy;
        ListNode r = head;
        while (n > 0) {
            r = r.next;
            n--;
        }
        while (r != null) {
            l = l.next;
            r = r.next;
        }
        l.next = l.next.next;
        return head.next;
    }
    // TC : O(n)
    // SC : o(1)
}