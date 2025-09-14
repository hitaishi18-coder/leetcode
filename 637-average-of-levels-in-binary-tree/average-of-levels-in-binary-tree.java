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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>(); // Result list jo har level ka average store karega
        if(root == null) return result;          // Agar tree empty ho → empty list return

        Queue<TreeNode> q = new LinkedList<TreeNode>(); // Queue for level order traversal (BFS)
        q.add(root);                                     // Start with root node

        while(!q.isEmpty()) // Jab tak queue me nodes hain
        {
            int n = q.size();       // Current level me nodes ki count
            double total = 0.0;     // Sum of values at this level

            for(int i = 0; i < n; i++) // Loop through all nodes of current level
            {
                TreeNode node = q.poll();     // Node remove from queue (current node)
                
                // Add children to queue for next level
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);

                total += node.val;            // Add current node value to total
            }

            result.add(total / n);           // Calculate average for current level and add to result
        }

        return result;                        // Return list of averages for all levels
    }
}
