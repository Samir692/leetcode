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
class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        while(!q.isEmpty()){
            ArrayList<Integer> level = new ArrayList<>();

            int qLength = q.size();
            for(int i = 0; i < qLength; i++){
                TreeNode lastPoll = q.poll();
                if(lastPoll != null){
                    level.add(lastPoll.val);
                    q.add(lastPoll.left);
                    q.add(lastPoll.right);
                }
            } 
            if(level.size() > 0){
                res.add(level);
            }
        }
        return res;
    }
}
