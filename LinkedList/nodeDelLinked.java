// There is a singly-linked list head and we want to delete a node node in it.
// You are given the node to be deleted node. You will not be given access to the first node of head.


// Runtime: 0ms      Memory:43.70MB

public class nodeDelLinked {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
}
