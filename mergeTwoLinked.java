// You are given the heads of two sorted linked lists list1 and list2.

// Merge the two lists into one sorted list. 
// The list should be made by splicing together the nodes of the first two lists.

// Return the head of the merged linked list.


// Runtime: 0ms      Memory:43MB


public class mergeTwoLinked {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1=list1;
        ListNode temp2=list2;
        ListNode head=new ListNode(64); //anything in value
        ListNode temp=head;
        while(temp1!=null && temp2!=null){
            if(temp1.val<temp2.val){
                ListNode n=new ListNode(temp1.val);
                temp.next=n;
                temp=n;
                temp1=temp1.next;
            }
            else{
                ListNode n=new ListNode(temp2.val);
                temp.next=n;
                temp=n;
                temp2=temp2.next;
            }   
        }
        if(temp1!=null)
            temp.next=temp1;
        else
            temp.next=temp2;
        return head.next;
    }
}
