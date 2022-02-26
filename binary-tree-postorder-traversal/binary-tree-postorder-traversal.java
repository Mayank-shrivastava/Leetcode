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
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()) {
            TreeNode curr = st.peek();
            if(curr.left == null && curr.right == null) {
                TreeNode temp = st.pop();
                list.add(temp.val);
            } else {
                if(curr.right != null) {
                    st.push(curr.right);
                    curr.right = null;
                } 
                if(curr.left != null) {
                    st.push(curr.left);
                    curr.left = null;
                }
            }
        }
        return list;
    }
}