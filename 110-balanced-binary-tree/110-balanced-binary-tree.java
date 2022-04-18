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
    public boolean isBalanced(TreeNode root) {
        if(root == null) {
            return true;
        }
        int lh = ht(root.left);
        int rh = ht(root.right);
        if(Math.abs(lh-rh) > 1) return false;
        boolean leftSubtree = isBalanced(root.left);
        boolean rightSubtree = isBalanced(root.right);
        return leftSubtree && rightSubtree;
    }
    
    public int ht(TreeNode root) {
        if(root == null) {
            return -1;
        }
        
        int lh = ht(root.left);
        int rh = ht(root.right);
        return Math.max(lh, rh) + 1;
    }
}