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
    private int maxpath(TreeNode root, int value[]) {
        if (root == null) {
            return 0;
        }

        int ln = Math.max(0, maxpath(root.left, value));
        int rh = Math.max(0, maxpath(root.right, value));

        // Maximum path passing through current node
        value[0] = Math.max(value[0], ln + rh + root.val);

        // Return the maximum one-sided path to parent
        return Math.max(ln, rh) + root.val;
    }

    public int maxPathSum(TreeNode root) {
        int value[] = new int[1];
        value[0] = Integer.MIN_VALUE;

        maxpath(root, value);

        return value[0];
    }
}