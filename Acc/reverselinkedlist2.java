package Acc;

public class reverselinkedlist2 {
  public static class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
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
  private static ListNode reverseBetween(ListNode head, int left, int right){
    if(head == null || left == right) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        for(int i=0; i<left-1; i++){
            prev = prev.next;
        }
        ListNode current = prev.next;
        for(int i=0; i<right-left; i++){
            ListNode temp = current.next;
            current.next = temp.next;
            temp.next = prev.next;
            prev.next = temp;
        }
        return dummy.next;
  }
  public static void main(String[] args) {
    ListNode head = createLinkedList(1, 232, 42, 23, 12, 21, 32231, 121, 2343);
    System.out.println("Original List:");
    printList(head);

    head = createLinkedList(1, 232, 42, 23, 12, 21, 32231, 121, 2343);
    ListNode reversedHead = reverseBetween(head, 2, 4);
    System.out.println("Reversed List:");
    printList(reversedHead);
  }
}