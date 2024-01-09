// Given the head of a singly linked list, return true if it is a 
// palindrome or false otherwise.


// Runtime: 3ms      Memory:68.5MB


public class palindromeLinked {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public boolean isPalindrome(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;


        //Finding Middle element
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }  
        if(fast!=null && fast.next==null)
            slow=slow.next;
        fast=head;
        
        // reverse a list
        ListNode temp=slow;
        ListNode bef=null;
        ListNode aft=null;
        while(temp!=null){
            aft=temp.next;
            temp.next=bef;
            bef=temp;
            temp=aft;
        }

        //checking for palindrome
        while(bef!=null){
            if(bef.val!=fast.val)
                return false;
            bef=bef.next;
            fast=fast.next;
        }
        return true;

    }
}
