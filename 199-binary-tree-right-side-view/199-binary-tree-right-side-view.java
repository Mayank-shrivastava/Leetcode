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
    public List<Integer> rightSideView(TreeNode root) {
        // iterative 
        if(root == null) {
            return new ArrayList<>();
        }
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> qq = new LinkedList<>();
        qq.add(root);
        while(!qq.isEmpty()) {
            int size = qq.size();
            for(int i = 0; i < size; i++) {
                TreeNode curr = qq.poll();
                if(i == size - 1) list.add(curr.val);
                if(curr.left != null) {
                    qq.add(curr.left);
                }
                if(curr.right != null) {
                    qq.add(curr.right);
                }
            }
        }
        return list;
    }
}