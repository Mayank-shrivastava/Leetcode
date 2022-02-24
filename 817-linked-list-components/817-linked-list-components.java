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
    public int numComponents(ListNode head, int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int val: nums) set.add(val);
        int count = 0;
        ListNode temp = new ListNode(-1, head);
        while(temp.next != null) {
            if(!set.contains(temp.val) && set.contains(temp.next.val)) {
                count++;
            }
            temp = temp.next;
        }
        return count;
    }
}