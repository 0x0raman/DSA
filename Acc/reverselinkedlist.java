package Acc;

public class reverselinkedlist {
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
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
//-----------------------------------------------------------------------
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

        head = createLinkedList(1, 232, 42, 23, 12, 21, 32231, 121, 2343);
        ListNode reversedHead = reverseList(head);
        System.out.println("Reversed List:");
        printList(reversedHead);
    }
}

// public class reverselinkedlist {
//     public class ListNode {
//         int val;
//         ListNode next;
    
//         ListNode() {
//         }
    
//         ListNode(int val) {
//             this.val = val;
//         }
    
//         ListNode(int val, ListNode next) {
//             this.val = val;
//             this.next = next;
//         }
//     }
//     private static ListNode createLinkedList(int... values) {
//         ListNode head = null;
//         ListNode current = null;
//         for (int value : values) {
//             if (head == null) {
//                 head = new ListNode(value);
//                 current = head;
//             } else {
//                 current.next = new ListNode(value);
//                 current = current.next;
//             }
//         }
//         return head;
//     }
//     public static ListNode reverseList(ListNode head) {
//         ListNode prev=null;
//         while(head!=null){
//             ListNode next = head.next;
//             head.next= prev;
//             prev=head;
//             head=next;
//         }
//         return prev;
//     }
//     public static void main(String[] args) {
//         ListNode head = createLinkedList(1,232,42,23,12,21,32231,121,2343);
//         System.out.println(reverseList(head));
//     }
// }