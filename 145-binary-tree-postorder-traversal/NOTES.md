*Recursive Postorder*
class Solution {
public List<Integer> postorderTraversal(TreeNode root) {
//postorder traversal-recursive approach
List<Integer> postorder = new ArrayList<>();
postorderHelper(root, postorder);
return postorder;
}
public void postorderHelper(TreeNode node, List<Integer> postorder) {
if(node == null) return;
// left right root
postorderHelper(node.left, postorder);
postorderHelper(node.right, postorder);
postorder.add(node.val);
}
}