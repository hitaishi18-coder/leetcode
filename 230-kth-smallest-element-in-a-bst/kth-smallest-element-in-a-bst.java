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
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> al = new ArrayList<>();
        visit(root , al);

        return al.get(k-1);
    }
    static void visit(TreeNode t , ArrayList<Integer> al)
    {
        if(t == null)
        {
            // do nothing
        }
        else 
        {
            visit(t.left, al);
            al.add(t.val);
            visit(t.right , al );
        }
    }
}