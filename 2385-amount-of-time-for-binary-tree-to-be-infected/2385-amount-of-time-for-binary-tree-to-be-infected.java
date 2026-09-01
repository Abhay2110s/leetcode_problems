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

    private TreeNode startNode;

    private void markParents(TreeNode root,Map<TreeNode, TreeNode> parents,int start) {

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {

            TreeNode node = q.poll();
            if (node.val == start) {
                startNode = node;
            }

            if (node.left != null) {
                parents.put(node.left, node);
                q.offer(node.left);
            }


            if (node.right != null) {
                parents.put(node.right, node);
                q.offer(node.right);
            }
        }
    }

    private int numberInfected(TreeNode startNode,Map<TreeNode, TreeNode> parents) {

        Queue<TreeNode> q = new LinkedList<>();
        Set<TreeNode> infected = new HashSet<>();

        q.offer(startNode);
        infected.add(startNode);

        int time = 0;

        while (!q.isEmpty()) {

            int size = q.size();
            boolean infectedNewNode = false;

            for (int i = 0; i < size; i++) {

                TreeNode node = q.poll();

                if (node.left != null &&
                    !infected.contains(node.left)) {

                    infected.add(node.left);
                    q.offer(node.left);
                    infectedNewNode = true;
                }

                if (node.right != null &&
                    !infected.contains(node.right)) {

                    infected.add(node.right);
                    q.offer(node.right);
                    infectedNewNode = true;
                }


                if (parents.containsKey(node)) {

                    TreeNode parentNode = parents.get(node);

                    if (!infected.contains(parentNode)) {

                        infected.add(parentNode);
                        q.offer(parentNode);
                        infectedNewNode = true;
                    }
                }
            }

            if (infectedNewNode) {
                time++;
            }
        }

        return time;
    }

    public int amountOfTime(TreeNode root, int start) {

        if (root == null) {
            return 0;
        }

        Map<TreeNode, TreeNode> parents = new HashMap<>();
        markParents(root, parents, start);
        return numberInfected(startNode, parents);
    }
}