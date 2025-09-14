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
import java.util.*;

class Solution {
    public boolean isValidBST(TreeNode root) {
        List<Integer> al = new ArrayList<>();
        visitInorder(root, al);

        for (int i = 0; i < al.size() - 1; i++) {
            if (al.get(i) >= al.get(i + 1)) {
                return false;  // fix: should return false
            }
        }
        return true;
    }

    private void visitInorder(TreeNode root, List<Integer> al) {
        if (root == null) return;
        visitInorder(root.left, al);
        al.add(root.val);
        visitInorder(root.right, al);
    }
}
