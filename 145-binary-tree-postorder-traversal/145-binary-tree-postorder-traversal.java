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
        if(root == null) return new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        List<Integer> postorder = new ArrayList<>();
        TreeNode curr = root;
        while(curr != null || !st.isEmpty()) {
            if(curr != null) {
                st.push(curr);
                curr = curr.left;
            } else {
                TreeNode temp = st.peek().right;
                if(temp != null) {
                    curr = temp;
                } else {
                    //get the top of the stack
                    temp = st.peek();
                    st.pop();
                    postorder.add(temp.val);
                    // root
                    while(!st.isEmpty() && temp == st.peek().right) {
                        temp = st.peek();
                        st.pop();
                        postorder.add(temp.val);
                    }
                }
            }
        }
        return postorder;
    }
}