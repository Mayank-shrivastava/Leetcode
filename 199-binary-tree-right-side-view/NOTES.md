1.iterative using bfs
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
for(int i = 1; i <= size; i++) {
TreeNode curr = qq.poll();
if(i == size) list.add(curr.val);
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
​
2.recursive using two levels
​