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
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        if (preorder == null || inorder == null ||
            preorder.length != inorder.length) {
            return null;
        }

        Map<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            hm.put(inorder[i], i);
        }

        return build(
            inorder,
            0,
            inorder.length - 1,
            preorder,
            0,
            preorder.length - 1,
            hm
        );
    }

    public TreeNode build(
        int[] inorder,
        int is,
        int ie,
        int[] preorder,
        int ps,
        int pe,
        Map<Integer, Integer> hm
    ) {
        if (ps > pe || is > ie) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[ps]);
        int inRoot = hm.get(root.val);

        int numsLeft = inRoot - is;

        root.left = build(
            inorder,
            is,
            inRoot - 1,
            preorder,
            ps + 1,
            ps + numsLeft,
            hm
        );

        root.right = build(
            inorder,
            inRoot + 1,
            ie,
            preorder,
            ps + numsLeft + 1,
            pe,
            hm
        );

        return root;
    }
}

