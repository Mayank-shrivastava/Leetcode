*Naive Appraoch*
*TC:O(N*N)
// balanced tree: for every node : ht(left)-ht(right) <= 1
class Solution {
public boolean isBalanced(TreeNode root) {
//naive appraoach: O(n^2) solution
if(root == null) return true;
int lh = height(root.left);
int rh = height(root.right);
if(Math.abs(lh-rh) > 1) return false;
boolean leftsubtree = isBalanced(root.left); // true false
boolean rightsubtree = isBalanced(root.right); // true false
return leftsubtree && rightsubtree;
}
public int height(TreeNode node) {
if(node == null) return 0;
int lh = height(node.left);
int rh = height(node.right);
return Math.max(lh, rh) + 1;
}
}
​
*Better Approach TC: O(N)*
class Solution {
public boolean isBalanced(TreeNode root) {
return height(root) != -1;
}
public int height(TreeNode node) {
if(node == null) return 0;
int lh = height(node.left);
if(lh == -1) return -1;
int rh = height(node.right);
if(rh == -1) return -1;
if(Math.abs(lh-rh) > 1) return -1;
return Math.max(lh,rh) + 1;
}
}
​