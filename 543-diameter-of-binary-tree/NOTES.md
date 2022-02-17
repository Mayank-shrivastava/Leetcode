*Diameter of binary tree optimized approach*
class Solution {
public int diameterOfBinaryTree(TreeNode root) {
return diameter(root).dia;
}
public DiaPair diameter(TreeNode root) {
if(root == null) {
DiaPair bp = new DiaPair();
bp.ht = -1;
bp.dia = 0;
return bp;
}
DiaPair ldp = diameter(root.left);
DiaPair rdp = diameter(root.right);
DiaPair sdp = new DiaPair();
sdp.ht = Math.max(ldp.ht, rdp.ht) + 1;
int sd = ldp.ht + rdp.ht + 2;
sdp.dia = Math.max(sd, Math.max(ldp.dia, rdp.dia));
return sdp;
}
}
​
class DiaPair {
int ht;
int dia;
}
​
*Diamter of Binary Tree brute force*
class Solution {
public int diameterOfBinaryTree(TreeNode root) {
if(root == null) return 0;
int ld = diameterOfBinaryTree(root.left);
int rd = diameterOfBinaryTree(root.right);
int sd = height(root.left) + height(root.right) + 2;
return Math.max(sd, Math.max(ld,rd));
}
public int height(TreeNode node) {
if(node == null) return -1;
int lh = height(node.left);
int rh = height(node.right);
return Math.max(lh, rh) + 1;
}
}