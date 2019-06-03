/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode plusOne(ListNode head) {
        if (plusOneRecursive(head) == 1) {
            ListNode carry = new ListNode(1);
            carry.next = head;
            return carry;
        }
        return head;
    }
    
    public int plusOneRecursive(ListNode node) {
        if (node == null) return 1;
        int carry = plusOneRecursive(node.next);
      
        if (node.val  + carry > 9) {
            node.val = 0;
            return 1;
        } else {
            node.val += carry;
            return 0;
        }
    }
}