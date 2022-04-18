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
        return isBal(root).isbal;
    }
    
    public BalancedPair isBal(TreeNode root) {
        if(root == null) {
            return new BalancedPair();
        }
        BalancedPair lbp = isBal(root.left);
        BalancedPair rbp = isBal(root.right);
        BalancedPair sbp = new BalancedPair();
        sbp.ht = Math.max(lbp.ht, rbp.ht) + 1;
        boolean sb = Math.abs(lbp.ht-rbp.ht) <= 1;
        sbp.isbal = lbp.isbal && rbp.isbal && sb;
        return sbp;
    } 

}

class BalancedPair {
    boolean isbal = true;
    int ht = -1;
}