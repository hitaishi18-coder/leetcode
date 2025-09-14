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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if(root == null) return result;

        makePath(root , "" , result);
        return result;
    }

    private void makePath(TreeNode root , String path , List<String> result)
    {
        if(root == null) return ;

        if(path.isEmpty())
        {
            path = String.valueOf(root.val);
        }
        else
        {
            path += "->" + root.val;
        }

        if(root.left == null && root.right == null)
        {
            result.add(path);
        }    
        else 
        {
            makePath(root.left , path , result);
            makePath(root.right , path , result);
        }
    }
}