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
// balanced tree: for every node : ht(left)-ht(right) <= 1
class Solution {
    public boolean isBalanced(TreeNode root) {
        //naive appraoach: O(n^2) solution
        if(root == null) return true;
        int lh = height(root.left);
        int rh = height(root.right);
        if(Math.abs(lh-rh) > 1) return false;
        boolean leftsubtree = isBalanced(root.left); // true false
        boolean rightsubtree = isBalanced(root.right); // true false
        return leftsubtree && rightsubtree;
    }
    
    public int height(TreeNode node) {
        if(node == null) return 0;
        int lh = height(node.left);
        int rh = height(node.right);
        return Math.max(lh, rh) + 1;
    }
}