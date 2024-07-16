// 236. Lowest Common Ancestor of a Binary Tree


// Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.

// According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”


// Runtime: 6ms      Memory:44.56MB

package trees;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lca(TreeNode root, TreeNode s, TreeNode d){
        if(root==null || root ==s || root==d) 
            return root;

        TreeNode l=lca(root.left,s,d);
        TreeNode r=lca(root.right,s,d);

        if(l==null)
            return r;
        if(r==null)
            return l;

        return root;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return lca(root,p,q);
    }
}
