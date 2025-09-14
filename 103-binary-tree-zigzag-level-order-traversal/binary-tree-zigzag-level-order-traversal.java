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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> main_list = new ArrayList<>();
        int height = getHeight(root);

        for (int level = 0; level < height; level++) {
            List<Integer> levelList = new ArrayList<>();
            collectNodesAtLevel(root, 0, level, levelList);

            if (level % 2 == 1) Collections.reverse(levelList);

            main_list.add(levelList);
        }

        return main_list;
    }

    static void collectNodesAtLevel(TreeNode root, int currentLevel, int targetLevel, List<Integer> levelList) {
        if (root == null) return;

        if (currentLevel == targetLevel) {
            levelList.add(root.val);
        } else {
            collectNodesAtLevel(root.left, currentLevel + 1, targetLevel, levelList);
            collectNodesAtLevel(root.right, currentLevel + 1, targetLevel, levelList);
        }
    }

    private int getHeight(TreeNode root) {
        if (root == null) return 0;
        int leftHeight = 1 + getHeight(root.left);
        int rightHeight = 1 + getHeight(root.right);
        return Math.max(leftHeight, rightHeight);
    }
}
