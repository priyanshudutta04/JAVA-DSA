// Given a linked list, swap every two adjacent nodes and return its head. 
// You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)


// Runtime: 0ms      Memory:41.12MB


public class swapNodeLinked {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode swapPairs(ListNode head) {
        ListNode t1=head;
        if (head==null || head.next==null)
            return head;
        ListNode nxt=head.next;  //copy for return
        ListNode t2=head.next;
        ListNode prev=null;
        ListNode temp=head.next.next;
        while(t1!=null && t1.next!=null){
            if(prev!=null)
                prev.next=t1.next;
            prev=t1;
            t2.next=t1;
            t1.next=temp;
            t1=temp;
            if(temp==null) break;
            temp=temp.next;
            t2=temp;
            if(temp==null) break;
            temp=temp.next;
        }

        return nxt;
    }
}
