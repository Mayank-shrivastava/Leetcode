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
        // iterative inorder traversal 
        // insert left in the stack until it gets null
        // then remove and print the top of the stack
        // then insert right in the stack
        List<Integer> inorder = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        TreeNode curr = root;
        while(curr != null || !st.isEmpty()) {
            // insert left in the stack until gets null
            if(curr != null) {
                st.push(curr);
                curr = curr.left;
            } else {
                curr = st.pop();
                inorder.add(curr.val);
                curr = curr.right;
            }
        }
        return inorder;
    }
}