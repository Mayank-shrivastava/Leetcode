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
        // postorder traversal 
        if(root == null) {
            return new ArrayList<>();
        }
        List<Integer> postOrder = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        Stack<Integer> out = new Stack<>();
        st.push(root);
        while(!st.isEmpty()) {
            TreeNode curr = st.pop();
            out.push(curr.val);
            if(curr.left != null) {
                st.push(curr.left);
            }
            if(curr.right != null) {
                st.push(curr.right);
            }
        }
        while(!out.isEmpty()) {
            postOrder.add(out.pop());
        }
        return postOrder;
    }
}