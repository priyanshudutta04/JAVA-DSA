// Given the root of a binary tree, return the zigzag level order traversal of its nodes values.
//  (i.e., from left to right, then right to left for the next level and alternate between).

// Runtime: 0ms      Memory:41.80MB


package trees;

import java.util.ArrayList;
import java.util.List;

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
    public int height(TreeNode root){
        if(root==null || (root.left==null && root.right==null)) return 0;
        return 1 + Math.max(height(root.left),height(root.right));
    }   
    public void leftRight(TreeNode root,int n, List<Integer> arr){
        if(root==null) return;
        if(n==1){
            arr.add(root.val);
            return;
        }
        leftRight(root.left,n-1,arr);
        leftRight(root.right,n-1,arr);
    }
    public void rightLeft(TreeNode root,int n, List<Integer> arr){
        if(root==null) return;
        if(n==1){
            arr.add(root.val);
            return;
        }
        rightLeft(root.right,n-1,arr);
        rightLeft(root.left,n-1,arr);
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        int level=height(root)+1;
        for(int i=1;i<=level;i++){
            List<Integer> arr= new ArrayList<>();
            if(i%2==0) rightLeft(root,i,arr);
            else leftRight(root,i,arr);
            ans.add(arr);
        }
        return ans;
    }
}