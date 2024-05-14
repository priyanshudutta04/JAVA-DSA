// Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

// Runtime: 0ms      Memory:40.90MB


package trees;

class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public boolean sameTree(TreeNode a,TreeNode b){
        if(a==null && b==null)return true;
        if(a==null || b==null)return false;
        if(a.val!=b.val)return false;
        return sameTree(a.left,b.left) && sameTree(a.right,b.right);
    }
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return root;
        TreeNode left=invertTree(root.left);
        TreeNode right=invertTree(root.right);
        root.left=right;
        root.right=left;
        return root;
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        root.left=invertTree(root.left);
        return sameTree(root.left,root.right);
    }
}