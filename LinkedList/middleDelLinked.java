// You are given the head of a linked list. Delete the middle node, and return the head of the modified linked list.

// The middle node of a linked list of size n is the ⌊n / 2⌋th node from the start using 0-based indexing, 
// where ⌊x⌋ denotes the largest integer less than or equal to x.


public class middleDelLinked {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null){
            return null;
        }
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next.next!=null && fast.next.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return head;
    }
}
