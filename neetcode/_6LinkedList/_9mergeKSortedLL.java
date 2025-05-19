package neetcode._6LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

@SuppressWarnings("unused")
public class _9mergeKSortedLL {
    private ListNode mergeKListsBrute(ListNode[] lists) {
        List<Integer> nodes = new ArrayList<>();
        for (ListNode lst : lists) {
            while (lst != null) {
                nodes.add(lst.val);
                lst = lst.next;
            }
        }
        Collections.sort(nodes);
        ListNode res = new ListNode(0);
        ListNode cur = res;
        for (int node : nodes) {
            cur.next = new ListNode(node);
            cur = cur.next;
        }
        return res.next;
    }
    // TC : O(nlogn)
    // SC : O(n)
    private ListNode mergeKListsHeapOptimized(ListNode[] lists) {
        if (lists.length == 0) return null;
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);
        for (ListNode list : lists) {
            if (list != null) {
                minHeap.offer(list);
            }
        }
        ListNode res = new ListNode(0);
        ListNode cur = res;
        while (!minHeap.isEmpty()) {
            ListNode node = minHeap.poll();
            cur.next = node;
            cur = cur.next;
            node = node.next;
            if (node != null) {
                minHeap.offer(node);
            }
        }
        return res.next;
    }
    // TC : O(nlogk)
    // SC : O(k)
    // divide n conquer (iteration) pending
}