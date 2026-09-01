/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private void marksParents(TreeNode root , Map<TreeNode , TreeNode> parents){
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode node = q.poll();
            if(node.left != null){
                q.offer(node.left);
                parents.put(node.left , node);
            }
            if(node.right != null){
                q.offer(node.right);
                parents.put(node.right , node);
            }
        }
    }


    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode , TreeNode> parents = new HashMap<>();
        marksParents(root , parents);

        Queue<TreeNode> q = new LinkedList<>();
        Set<TreeNode> visited = new HashSet<>();

        q.offer(target);
        visited.add(target);
        int distance = 0;

        while(!q.isEmpty()){
            if(distance == k) break;
            int size = q.size();

            for(int i = 0 ; i<size ; i++){
                TreeNode node = q.poll();

                if(node.left != null && !visited.contains(node.left)){
                    visited.add(node.left);
                    q.offer(node.left);
                }

                if(node.right != null && !visited.contains(node.right)){
                    visited.add(node.right);
                    q.offer(node.right);
                }

                if(parents.containsKey(node)){
                    TreeNode parentnode = parents.get(node);
                    
                    if(!visited.contains(parentnode)){
                        visited.add(parentnode);
                        q.offer(parentnode);
                    }
                }
            }
            distance++;
        }
        List<Integer> result = new ArrayList<>();
        while(!q.isEmpty()){
            result.add(q.poll().val);
        }

        return result;
    }
}