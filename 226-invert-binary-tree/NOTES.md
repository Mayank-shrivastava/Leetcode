class Solution {
public TreeNode invertTree(TreeNode root) {
if(root == null) {
return null;
}
TreeNode left_subtree = invertTree(root.left);
TreeNode right_subtree = invertTree(root.right);
root.left = right_subtree;
root.right = left_subtree;
return root;
}
}