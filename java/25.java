/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k == 1){
            return head;
        }
        ListNode node = head;
        int i = 1;
        while(i < k && node != null){
            node = node.next;
            i++;
        }
        if(node == null){
            return head;
        }
        ListNode next = reverseKGroup(node.next,k);
        node.next = null;
        ListNode cur = head,prev = null;
        while(cur != null ){
            ListNode temp = cur;
            cur = cur.next;
            temp.next = prev;
            prev = temp;
        }
        head.next = next;
        return prev;
        
    }
}