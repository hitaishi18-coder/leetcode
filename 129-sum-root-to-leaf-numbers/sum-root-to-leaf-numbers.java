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

    int sum = 0;
    public void sumNum(TreeNode node , int num)
    {
        num = num * 10 + node.val;

        if(node.left == null && node.right == null)
        {
            sum = sum + num ;
            return;
        }
        if(node.left != null) sumNum(node.left,num);
        if(node.right != null) sumNum(node.right,num);
    }
    public int sumNumbers(TreeNode root) {
        sumNum(root ,0);
        return sum;   
    }
}