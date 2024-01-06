// Given the head of a linked list, rotate the list to the right by k places.

// Runtime: 0ms      Memory:42.30MB


public class rotateLinked {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp=head;
        int n=0;
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        if(n==0)    return head;
        k=k%n;
        if(k==0)    return head;

        temp=head;
        for(int i=0;i<n-k-1;i++){
            temp=temp.next;
        }
        ListNode q= temp.next;
        ListNode re= temp.next;
        temp.next=null;
        
        while(q.next !=null)  
            q=q.next;

        q.next=head;
        return re;
    }
}
