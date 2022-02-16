Stack<TreeNode> st = new Stack<>();
List<Integer> postorder = new ArrayList<>();
TreeNode curr = root;
while(curr != null || !st.isEmpty()) {
if(curr != null) {
st.push(curr);
curr = curr.left;
} else {
TreeNode temp = st.peek().right;
if(temp != null) {
curr = temp;
} else {
//get the top of the stack
temp = st.peek();
st.pop();
postorder.add(temp.val);
// root
while(!st.isEmpty() && temp == st.peek().right) {
temp = st.peek();
st.pop();
postorder.add(temp.val);
}
}
}
}
return postorder;
}
}
​
​