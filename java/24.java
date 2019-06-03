/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode cur = head.next;
        ListNode cur2 = head.next.next;
        head.next = swapPairs(cur2);
        cur.next = head;
        head = cur;
        return head;
    }
}