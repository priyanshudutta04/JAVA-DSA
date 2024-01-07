// Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, 
// and return the reordered list.

// The first node is considered odd, and the second node is even, and so on.

// Note that the relative order inside both the even and odd groups should remain as it was in the input.

// You must solve the problem in O(1) extra space complexity and O(n) time complexity.


// Runtime: 0ms      Memory:44.49MB

public class oddEvenLinked {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode oddEvenList(ListNode head) {

        if(head==null || head.next==null)
            return head;
 
        ListNode odd=head;
        ListNode even=head.next;
        ListNode copy=head.next;
        ListNode temp=head.next.next;
        boolean iseven=false;

        while(temp!=null){
            if(iseven==false){
                odd.next=temp;
                odd=temp;
                iseven=true;
            }
            else{
                even.next=temp;
                even=temp;
                iseven=false;
            }    
            temp=temp.next;
        }
        odd.next=copy;
        even.next=null;

        return head;
    }
}
