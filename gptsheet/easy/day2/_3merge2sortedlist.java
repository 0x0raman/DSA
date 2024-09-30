package gptsheet.easy.day2;

public class _3merge2sortedlist {
    public static void main(String[] args) {
        ListNode head1 = createLinkedList(1, 2, 3, 4);
        System.out.println("Original List 1:");
        printList(head1);
        
        ListNode head2 = createLinkedList(1, 232, 42, 23, 12, 21, 32231, 121, 2343);
        System.out.println("Original List 2:");
        printList(head2);
        ListNode merged = mergeTwoLists(head1, head2);
        System.out.println("Merged List: ");
        printList(merged);
    }

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
    
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1!=null && list2!=null){
            if(list1.val<list2.val){
                list1.next = mergeTwoLists(list1.next, list2);
                return list1;
            }
            else{
                list2.next= mergeTwoLists(list1, list2.next);
                return list2;
            }
        }
        if(list1==null) return list2;
        return list1;
    }
}
