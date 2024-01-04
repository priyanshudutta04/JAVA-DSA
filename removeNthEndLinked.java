// Given the head of a linked list, remove the nth node from the end of the list and return its head.

// Runtime: 0ms      Memory:41.70MB


public class removeNthEndLinked {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
 

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow=head;
        ListNode fast=head;
        for(int i=1;i<n;i++){
            fast=fast.next;
        }     
        if (fast == null){
            
            return head.next;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
    }
    
}
