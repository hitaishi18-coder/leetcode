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
    int maxDiameter = 0 ;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return maxDiameter;
    }

    private int height(TreeNode node)
    {
        if(node == null) return 0;

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

       
      // “Current node ke left aur right subtree ki heights ka sum (edges) aur ab tak ka maximum diameter me se jo bada hai, use maxDiameter me update karo.”
        maxDiameter = Math.max(maxDiameter, leftHeight + rightHeight);

        // return height of this node (for parent calculation)
        return 1 + Math.max(leftHeight, rightHeight);
    }
}