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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> level_order_traversal = new ArrayList<>();
        Stack<List<Integer>> st = new Stack<>();
        Queue<TreeNode> qq = new LinkedList<>();
        qq.add(root);
        while(!qq.isEmpty()) {
            int size = qq.size();
            List<Integer> temp = new ArrayList<>();
            for(int i = 0; i < size; i++) {
                TreeNode rv_node = qq.remove();
                temp.add(rv_node.val);
                if(rv_node.left != null) {
                    qq.add(rv_node.left);
                }
                if(rv_node.right != null) {
                    qq.add(rv_node.right);
                }
            }
            st.push(temp);
        }
        while(!st.isEmpty()) {
            level_order_traversal.add(st.pop());
        }
        return level_order_traversal;
     }
}