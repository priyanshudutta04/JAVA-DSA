// 2096. Step-By-Step Directions From a Binary Tree Node to Another


// You are given the root of a binary tree with n nodes. Each node is uniquely assigned a value from 1 to n. You are also given an integer startValue representing the value of the start node s, and a different integer destValue representing the value of the destination node t.

// Find the shortest path starting from node s and ending at node t. Generate step-by-step directions of such path as a string consisting of only the uppercase letters 'L', 'R', and 'U'. Each letter indicates a specific direction:

// 'L' means to go from a node to its left child node.
// 'R' means to go from a node to its right child node.
// 'U' means to go from a node to its parent node.
// Return the step-by-step directions of the shortest path from node s to node t


// Runtime: 38ms      Memory:80.28MB


package trees;

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
class Solution {



    // public String nodepath(TreeNode root,int s, String path){


    //     if(root.val==s)
    //         return path;
    
    //     String r=nodepath(root.right,s,path+"R");
    //     String l=nodepath(root.left,s,path+"L");


    //     if(l=="")
    //         return r;    
    //     return l;

    // }

    public boolean nodepath(TreeNode root, int val, StringBuilder sb) {
        if (root == null)
            return false;

        if (root.val == val)
            return true;

        if (root.left != null) {
            sb.append("L");
            if (nodepath(root.left, val, sb))
                return true;
            sb.deleteCharAt(sb.length() - 1); 
        }

        if (root.right != null) {
            sb.append("R");
            if (nodepath(root.right, val, sb))
                return true;
            sb.deleteCharAt(sb.length() - 1);
        }

        return false;
    }


    public String getDirections(TreeNode root, int startValue, int destValue) {


        StringBuilder first = new StringBuilder(); 
        StringBuilder sec = new StringBuilder(); 

        nodepath(root, startValue, first);
        nodepath(root, destValue, sec);

        
        System.out.println(first);
        System.out.println(sec);


        int j=0;
        for(j=0;j<Math.min(first.length(),sec.length());j++){
            if(first.charAt(j)!=sec.charAt(j))
                break;
        }

        // String fhalf=first.substring(i);
        // String shalf=sec.substring(i);

        // System.out.println(fhalf);
        // System.out.println(shalf);

        String res="";
        for(int i=0;i<first.length()-j;i++)
            res+=("U");
        
        res+=(sec.substring(j));
        return res;
    }
}