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
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;

        // If root itself is the node to delete
        if (root.val == key) {
            return helper(root);
        }

        TreeNode dummy = root;

        while (root != null) {

            if (root.val > key) {

                if (root.left != null && root.left.val == key) {
                    root.left = helper(root.left);
                    break;
                } 
                else {
                    root = root.left;
                }

            } else {

                if (root.right != null && root.right.val == key) {
                    root.right = helper(root.right);
                    break;
                } 
                else {
                    root = root.right;
                }
            }
        }

        return dummy;
    }

    public TreeNode helper(TreeNode root) {

        // No left child
        if (root.left == null) {
            return root.right;
        }

        // No right child
        if (root.right == null) {
            return root.left;
        }

        // Both children exist
        TreeNode rightChild = root.right;

        TreeNode lastNode = findLastNode(root.left);

        // Attach original right subtree
        lastNode.right = rightChild;

        return root.left;
    }

    public TreeNode findLastNode(TreeNode root) {

        while (root.right != null) {
            root = root.right;
        }

        return root;
    }
}