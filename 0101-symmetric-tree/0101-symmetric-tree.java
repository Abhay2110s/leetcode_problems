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
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
        {
            return true;
        }
        return hooi(root.left , root.right);
    }

    private boolean hooi(TreeNode left , TreeNode right)
    {
        if(left == null && right == null)
        {
            return true;
        }

        if(left == null || right == null || left.val != right.val )
        {
            return false;
        }
        return hooi(left.left,right.right) && hooi(left.right , right.left);
    }

}