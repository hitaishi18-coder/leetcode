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
    private Integer prev = null; // Integer bcoz wrapper class use krni hai 
    private int mindifference = Integer.MAX_VALUE; // answer store krne ke 
    // liye 
    public int getMinimumDifference(TreeNode root) {
        inOrder(root);
        return mindifference;
    }
    private void inOrder(TreeNode node)
    {
        if(node == null) return ;

        // left subtree

        inOrder(node.left);

        if(prev != null)
        {
            mindifference = Math.min(mindifference,node.val - prev);
        }

        prev = node.val;

        // right subtree

        inOrder(node.right);
    }
}