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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) {
           return new ArrayList<>();
        }
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> qq = new ArrayDeque<>();
        qq.add(root);
        while(!qq.isEmpty()) {
            int size = qq.size();
            List<Integer> temp = new ArrayList<>();
            for(int i = 0; i < size; i++) {
                TreeNode rvNode = qq.poll();
                temp.add(rvNode.val);
                if(rvNode.left != null) {
                    qq.add(rvNode.left);
                }
                if(rvNode.right != null) {
                    qq.add(rvNode.right);
                }
            }
            list.add(temp);
        }
        return list;
    }
}