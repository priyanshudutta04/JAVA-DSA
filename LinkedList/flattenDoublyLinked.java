// You are given a doubly linked list, which contains nodes that have a next pointer, a previous pointer, and an additional child pointer. 

// Given the head of the first level of the list, flatten the list so that all the nodes appear in a single-level, doubly linked list. Let curr be a node with a child list. The nodes in the child list should appear after curr and before curr.next in the flattened list.

// Return the head of the flattened list. The nodes in the list must have all of their child pointers set to null.


// Runtime: 1ms      Memory:41.62MB

class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};

public class flattenDoublyLinked {
    public Node flatten(Node head) {
        Node temp=head;
        while(temp!=null){        
            Node temp2=temp.next;   
            if(temp.child!=null){
                Node c=flatten(temp.child);
                temp.next=c;
                c.prev=temp;
                while(c.next!=null){
                    c=c.next;
                }
                if(temp2!=null) temp2.prev=c;
                c.next=temp2;          
            }
            temp.child=null;
            temp=temp2;
        }
        return head;
    }
}
