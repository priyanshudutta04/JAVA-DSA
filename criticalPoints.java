// 2058. Find the Minimum and Maximum Number of Nodes Between Critical Points

// A critical point in a linked list is defined as either a local maxima or a local minima.
// A node is a local maxima if the current node has a value strictly greater than the previous node and the next node.
// A node is a local minima if the current node has a value strictly smaller than the previous node and the next node.
// Note that a node can only be a local maxima/minima if there exists both a previous node and a next node.
// Given a linked list head, return an array of length 2 containing [minDistance, maxDistance] where minDistance is the minimum distance between any two distinct critical points and maxDistance is the maximum distance between any two distinct critical points. If there are fewer than two critical points, return [-1, -1].

// Runtime: 7ms      Memory:69.6MB

import java.util.ArrayList;

class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        int[] a={-1,-1};

        ListNode prev=head;       
        ListNode temp=head.next;
        
        ArrayList<Integer> pos = new ArrayList<>();
        int i=1;
        int last=-1;
        int min=Integer.MAX_VALUE;

        while(temp.next!=null){
            if(prev!=null && temp.next!=null){
                
                if( (prev.val>temp.val && temp.next.val>temp.val) ||  (prev.val<temp.val && temp.next.val<temp.val)){
                    pos.add(i);
                    if(last!=-1 && i-last<min)
                        min=i-last;
                    last=i;                     
                }          
            }
            prev=temp;
            temp=temp.next;
            i++;
        }

        int l=pos.size();
        if(l>1){
            a[1]=pos.get(l-1)-pos.get(0);     
            a[0]=min;
        }  
        return a;
    }
}
