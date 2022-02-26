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
        if(root == null) {
            return new ArrayList<>();
        }
        Stack<TreeNode> st = new Stack<>();
        List<Integer> list = new ArrayList<>();
        st.push(root);
        while(!st.isEmpty()) {
            TreeNode rv_node = st.pop();
            list.add(rv_node.val);
            if(rv_node.right != null) {
                st.push(rv_node.right);
            }
            if(rv_node.left != null) {
                st.push(rv_node.left);
            }
        }
        return list;
    }
}