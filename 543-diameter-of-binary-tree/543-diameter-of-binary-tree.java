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
    public int diameterOfBinaryTree(TreeNode root) {
        //Optimized approach
        return diameter(root).dia;
    }
    
    public DiaPair diameter(TreeNode node) {
        if(node == null) {
            DiaPair bp = new DiaPair();
            bp.ht = -1;
            bp.dia = 0;
            return bp;
        }
        DiaPair ldp = diameter(node.left); // left subtree dia pair
        DiaPair rdp = diameter(node.right); // right subtree dia pair 
        DiaPair sdp = new DiaPair(); // self node dia pair
        sdp.ht = Math.max(ldp.ht, rdp.ht) + 1;
        int sd = ldp.ht + rdp.ht + 2;
        sdp.dia = Math.max(sd, Math.max(ldp.dia, rdp.dia));
        return sdp;
    }
}

class DiaPair {
    int ht;
    int dia;
}