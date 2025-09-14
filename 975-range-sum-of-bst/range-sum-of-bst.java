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
    int answer ;
    public int rangeSumBST(TreeNode root, int low, int high) {
        answer = 0;
        dfs(root, low , high);
        return answer;
    }
    public void dfs(TreeNode node , int L , int R)
    {
        if(node != null)
        {
            if(L <= node.val && node.val <= R)
            {
                answer += node.val;
            }
            if(L < node.val)
            {
                dfs(node.left, L , R);
            }
            if(R > node.val)
            {
                dfs(node.right, L , R);
            }
        }
    }
}