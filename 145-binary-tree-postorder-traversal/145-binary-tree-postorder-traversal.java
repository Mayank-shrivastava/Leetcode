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
    public List<Integer> postorderTraversal(TreeNode root) {
        //postorder traversal-recursive approach
        List<Integer> postorder = new ArrayList<>();
        postorderHelper(root, postorder);
        return postorder;
    }
    
    public void postorderHelper(TreeNode node, List<Integer> postorder) {
        if(node == null) return;
        // left right root
        postorderHelper(node.left, postorder);
        postorderHelper(node.right, postorder);
        postorder.add(node.val);
    }
}