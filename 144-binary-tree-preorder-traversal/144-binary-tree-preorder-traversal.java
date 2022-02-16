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
    public List<Integer> preorderTraversal(TreeNode root) {
        // iterative pre-order traversal
        // for iterative traversal we use stack data structure and insert right and left in the stack
        if(root == null) return new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        List<Integer> traversal = new ArrayList<>();
        while(!st.isEmpty()) {
            TreeNode top = st.pop();
            traversal.add(top.val);
            if(top.right != null) st.push(top.right);
            if(top.left != null) st.push(top.left);
        }
        return traversal;
    }
}