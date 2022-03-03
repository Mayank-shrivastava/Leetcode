/*iterative approach for reversing the linked list*/
class Solution {
public ListNode reverseList(ListNode head) {
ListNode prev = null;
ListNode curr = head;
while(curr != null) {
ListNode temp = curr.next;
curr.next = prev; //reverse the curr node
// traversing the pointer for reversing the further nodes
prev = curr;
curr = temp;
}
return prev;
}
}
/*recursive reversing the linkedlist*/