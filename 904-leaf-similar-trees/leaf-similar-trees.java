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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaf1 = new ArrayList<>();
        List<Integer> leaf2 = new ArrayList<>();

        collectLeaves(root1 , leaf1);
        collectLeaves(root2 , leaf2);

        return leaf1.equals(leaf2);
    }

    private void collectLeaves(TreeNode root , List<Integer> leaves)
    {
        if(root == null) return;

        if(root.left == null && root.right == null)
        {
            leaves.add(root.val);   // leaf node last wala 
        }
        else 
        {
            collectLeaves(root.left , leaves );
            collectLeaves(root.right , leaves );
        }
    }
}