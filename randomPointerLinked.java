// A linked list of length n is given such that each node contains an additional random pointer, which could point to 
// any node in the list, or null.

// Construct a deep copy of the list. The deep copy should consist of exactly n brand new nodes, where each new
// node has its value set to the value of its corresponding original node. Both the next and random pointer of the 
// new nodes should point to new nodes in the copied list such that the pointers in the original list and copied list 
// represent the same list state. None of the pointers in the new list should point to nodes in the original list.


// Runtime: 0ms      Memory:44.7MB


class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class randomPointerLinked {
    public Node copyRandomList(Node head) {
        Node n=new Node(-1);
        Node t1=head;
        Node t2=n;
        // creating deepcopy with next
        while(t1!=null){
            Node nh=new Node(t1.val);
            t2.next=nh;
            t2=nh;
            t1=t1.next;
        }
        n=n.next;
        t1=head;
        t2=n;
        Node temp=new Node(-1);
        
        //alternate connections
        while(t1!=null){
            temp.next=t1;
            t1=t1.next;
            temp=temp.next;

            temp.next=t2;
            t2=t2.next;
            temp=temp.next;
        }

        t1=head;
        t2=n;
        //random pointers
        while(t1!=null){
            if(t1.random==null)  t2.random=null;
            else  t2.random=t1.random.next;
            t1=t2.next;
            if(t1!=null) t2=t1.next;
        }

        t1=head;
        t2=n;
        //removing alternate connections
        while(t1!=null){
            t1.next=t2.next;
            t1=t1.next;
            if(t1!=null) t2.next=t1.next;
            t2=t2.next;
        }
        return n;
    }
}
