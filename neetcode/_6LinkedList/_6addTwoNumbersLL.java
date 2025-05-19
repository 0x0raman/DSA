package neetcode._6LinkedList;

@SuppressWarnings("unused")
public class _6addTwoNumbersLL {
    private ListNode addTwoNumbersRecursive(ListNode l1, ListNode l2) {
        return add (l1, l2, 0);
    }
    private ListNode add(ListNode l1, ListNode l2, int carry) {
        if (l1 == null && l2 == null && carry == 0) return null;
        int v1 = 0, v2 = 0;
        if (l1 != null) v1 = l1.val;
        if (l2 != null) v2 = l2.val;
        int sum = v1 + v2 + carry;
        int newCarry = sum / 10;
        int nodeValue = sum % 10;
        ListNode nextNode = add(
            (l1 != null) ? l1.next : null,
            (l2 != null) ? l2.next : null,
            newCarry
        );
        return new ListNode(nodeValue, nextNode);
    }
    // TC : O(m + n)  | len(l1 & l2)
    // SC : O(m + n)

    private ListNode addTwoNumbersIteration(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode cur = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int v1 = (l1 != null) ? l1.val : 0;
            int v2 = (l2 != null) ? l2.val : 0;
            int val = v1 + v2 + carry;
            carry = val / 10;
            val = val % 10;
            cur.next = new ListNode(val);
            cur = cur.next;
            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }
        return dummy.next;
    }
    // TC : O(m + n)
    // SC : O(max(m, n))
}