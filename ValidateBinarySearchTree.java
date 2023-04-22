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
        System.out.println(root.val);

        if(root == null){
            return false;
        }

        if(root.left == null && root.right == null){
            return true;
        }

        if(root.left.val < root.val && root.right.val > root.val){

            System.out.println("here");
            return true;
        }
        return isValidBST(root.left) && isValidBST(root.right);
        
    }
}
