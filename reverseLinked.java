// Given the head of a singly linked list, reverse the list, and return the reversed list.


// Runtime: 0ms      Memory:41.80MB

public class reverseLinked {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode reverseList(ListNode head) {
        ListNode temp=head;
        ListNode bef=null;
        ListNode aft=null;

        while(temp!=null){
            aft=temp.next;
            temp.next=bef;
            bef=temp;
            temp=aft;
        }

        return bef;
    }
}
