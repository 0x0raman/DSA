package gptsheet.medium.test;

public class _1addTwoNumbers {
    public static void main(String[] args) {
        // Create first linked list: 2 -> 4 -> 3 (representing 342)
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        // Create second linked list: 5 -> 6 -> 4 (representing 465)
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        // Call addTwoNumbers method
        ListNode result = addTwoNumbers(l1, l2);

        // Print the result linked list (should print 7 -> 0 -> 8, representing 807)
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummHead = new ListNode(0);
        ListNode curr = dummHead;
        int carry = 0;

        // loop through both lists and process each digit
        while (l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null) ? l1.val : 0; // get value from l1 or 0 if l1 is null
            int y = (l2 != null) ? l2.val : 0; // get value from l2 or 0 if l2 is null
            int sum = carry + x + y; // calculate sum of two digits + carry
            carry = sum / 10; // update carry for next iteration
            curr.next = new ListNode(sum % 10); // create a new node with the digit of the sum
            curr = curr.next; // move to the next node

            // move to the next nodes in l1 and l2, if possible
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }

        return dummHead.next; // return the result list, skipping the dummy head
    }

    // Definition for singly-linked list.
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
}

// TC : O(max(m,n)) where m and n are length of l1 and l2