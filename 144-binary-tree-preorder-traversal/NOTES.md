*Recursive pre-order*
class Solution {
public List<Integer> preorderTraversal(TreeNode root) {
// recursive preorder traversal
// pre-order : root left right
List<Integer> traversal = new ArrayList<>();
preorderHelper(root, traversal);
return traversal;
}
public void preorderHelper(TreeNode node, List<Integer> traversal) {
if(node == null) return;
traversal.add(node.val);
preorderHelper(node.left, traversal);
preorderHelper(node.right, traversal);
}
}
​
*Iterative pre-order traversal*
class Solution {
public List<Integer> preorderTraversal(TreeNode root) {
// iterative pre-order traversal
// for iterative traversal we use stack data structure and insert right and left in the stack
if(root == null) return new ArrayList<>();
Stack<TreeNode> st = new Stack<>();
st.push(root);
List<Integer> traversal = new ArrayList<>();
while(!st.isEmpty()) {
TreeNode top = st.pop();
traversal.add(top.val);
if(top.right != null) st.push(top.right);
if(top.left != null) st.push(top.left);
}
return traversal;
}
}