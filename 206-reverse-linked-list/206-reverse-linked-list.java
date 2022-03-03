/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode rest = reverseList(head.next); // get the rest of the ll 
        head.next.next = head; // head ke next ka next head mtlb head ka next rest hai jiska next head hojaega
        head.next = null; // haed ke next ko null krdo 
        return rest;
    }
}