// 1110. Delete Nodes And Return Forest


// Given the root of a binary tree, each node in the tree has a distinct value.
// After deleting all nodes with a value in to_delete, we are left with a forest (a disjoint union of trees).
// Return the roots of the trees in the remaining forest. You may return the result in any order.


// Runtime: 1ms      Memory:44.74MB


package trees;

import java.util.*;

class Solution {

        /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */

    List<TreeNode> n=new ArrayList<>();
    Set<Integer> deletes = new HashSet<>();

    public TreeNode rem(TreeNode root, boolean flag){
        if(root==null) 
            return null;
    
        root.left=rem(root.left,deletes.contains(root.val));
        root.right=rem(root.right,deletes.contains(root.val));

        if(deletes.contains(root.val)){        
           if(root.left!=null)
                n.add(root.left);
            if(root.right!=null)
                n.add(root.right);
            return null;
        }
        return root;
    }

    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {

        for(int i:to_delete)
            deletes.add(i);
        
        rem(root,true);

        if(!deletes.contains(root.val)){
            n.add(root);
        }

        return n;
    }
}