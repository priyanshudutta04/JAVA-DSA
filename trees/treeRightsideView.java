// Given the root of a binary tree, imagine yourself standing on the right side of it, 
// return the values of the nodes you can see ordered from top to bottom.

// Runtime: 1ms      Memory:42.04MB


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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        int level=height(root)+1;
        for(int i=1;i<=level;i++){
            List<Integer> arr= new ArrayList<>();    
            leftRight(root,i,arr);
            ans.add(arr);
        }
        return ans;
    }
    public List<Integer> rightSideView(TreeNode root) {     
        List<List<Integer>> lev=levelOrder(root);
        List<Integer> ans=new ArrayList<>();
        if(root==null) return ans;
        for(int i=0;i<lev.size();i++){
            List<Integer> arr=lev.get(i);
            ans.add(arr.get(arr.size()-1));
        }
        return ans;
    }
}