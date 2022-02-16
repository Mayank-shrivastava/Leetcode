*Recursive inorder*
class Solution {
public List<Integer> inorderTraversal(TreeNode root) {
// inorder traversal recursive solution
List<Integer> inorder = new ArrayList<>();
inorderHelper(root, inorder);
return inorder;
}
// left root right
public void inorderHelper(TreeNode node, List<Integer> inorder) {
if(node == null) return;
inorderHelper(node.left, inorder);
inorder.add(node.val);
inorderHelper(node.right, inorder);
}
}
​
*Iterative inorder*
​