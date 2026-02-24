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
    public int sumRootToLeaf(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode node, int currentValue) {
        if (node == null)
            return 0;

        // Update current binary value
        currentValue = (currentValue << 1) | node.val;

        // If leaf node, return computed value
        if (node.left == null && node.right == null) {
            return currentValue;
        }

        // Otherwise, sum from left and right
        return dfs(node.left, currentValue) +
               dfs(node.right, currentValue);
    }
}