class Solution {

    public void inorderT(List<Integer> res, TreeNode root) {
        if (root == null) {
            return;
        }
        
        inorderT(res, root.left);

        res.add(root.val);

        inorderT(res, root.right);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorderT(res, root);
        return res;
    }
}