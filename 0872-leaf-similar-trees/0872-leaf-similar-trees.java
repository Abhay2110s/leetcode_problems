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

    private void getLeaves(TreeNode root, ArrayList<Integer> leaves) {

        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            leaves.add(root.val);
            return;
        }
        getLeaves(root.left, leaves);
        getLeaves(root.right, leaves);
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        getLeaves(root1, l1);
        getLeaves(root2, l2);

        return l1.equals(l2);
    }
}