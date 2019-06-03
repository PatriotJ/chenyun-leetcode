/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode odd = new ListNode(-1);
        ListNode even = new ListNode(-1);
        ListNode cur1 = odd;
        ListNode cur2 = even;
        int i = 0;
        while(head != null){
            if(i % 2 == 0){
                cur1.next = new ListNode(head.val);
                cur1 = cur1.next;
            }else{
                cur2.next = new ListNode(head.val);
                cur2 = cur2.next;
            }
            i ++;
            head = head.next; 
        }
        cur1.next = even.next;
        return odd.next;
    }
}