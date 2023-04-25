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
class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        return valid(root, null, null);
    }

    boolean valid(TreeNode node, Integer left, Integer right){
        if(node == null) return true;
        
        if (
            (left != null && node.val <= left) || (right != null && node.val >= right)
        ){
            return false;
        }
        return valid(node.left, left, node.val) &&
        valid(node.right, node.val, right);

    }
}
