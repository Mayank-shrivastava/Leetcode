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
    public List<Integer> inorderTraversal(TreeNode root) {
        // inorder traversal recursive solution 
        List<Integer> inorder = new ArrayList<>();
        inorderHelper(root, inorder);
        return inorder;
    }
    
    // left root right
    public void inorderHelper(TreeNode node, List<Integer> inorder) {
        if(node == null) return;
        inorderHelper(node.left, inorder);
        inorder.add(node.val);
        inorderHelper(node.right, inorder);
    }
}