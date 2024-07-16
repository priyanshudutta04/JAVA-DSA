
// 2196. Create Binary Tree From Descriptions

// You are given a 2D integer array descriptions where descriptions[i] = [parenti, childi, isLefti] indicates that parenti is the parent of childi in a binary tree of unique values. Furthermore,

// If isLefti == 1, then childi is the left child of parenti.
// If isLefti == 0, then childi is the right child of parenti.
// Construct the binary tree described by descriptions and return its root.

// The test cases will be generated such that the binary tree is valid.


// Runtime: 66ms      Memory:55.68MB


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

package trees;
class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {
           
        Map<Integer, TreeNode> nodes = new HashMap<>();
        Set<Integer> children = new HashSet<>();
           
        for (int arr[] : descriptions) {
            
            nodes.putIfAbsent(arr[0], new TreeNode(arr[0]));
            nodes.putIfAbsent(arr[1], new TreeNode(arr[1]));
            children.add(arr[1]);
            
            TreeNode pNode = nodes.get(arr[0]);
            TreeNode cNode = nodes.get(arr[1]);
            
            if (arr[2] == 1) {
                pNode.left = cNode;
            } else {
                pNode.right = cNode;
            }               
        }
        
        for (int val : nodes.keySet()) {
            if (children.contains(val)==false) 
                return nodes.get(val);
        }
        return null;
        
    }
}