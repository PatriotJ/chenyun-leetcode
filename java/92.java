/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode cur = dummy;
        while(m > 1){
            cur = cur.next;
            m --;
            n --;
        }
        ListNode tmp = null,pre = cur.next;
        while(n > 0){
            ListNode tmp2 = pre.next;
            pre.next = tmp;
            tmp = pre;
            pre = tmp2;
            n--;
        }
        cur.next.next = pre;
        cur.next = tmp;
        return dummy.next;
        
        
    }
}