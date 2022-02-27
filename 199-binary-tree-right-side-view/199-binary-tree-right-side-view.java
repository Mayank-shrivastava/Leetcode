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
    int prev_level = 0;
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(root, 1, list);
        return list;
    }
    
    void helper(TreeNode node, int level, List<Integer> list) {
        if(node == null) return;
        if(prev_level < level) {
            list.add(node.val);
            prev_level = level;
        }
        helper(node.right, level + 1, list);
        helper(node.left, level + 1, list);
    }
}