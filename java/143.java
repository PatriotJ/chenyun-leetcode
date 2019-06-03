/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if(head != null && head.next != null){
            ListNode fast = head;
            ListNode slow = head;
            while(fast != null && fast.next != null){
                fast = fast.next.next;
                slow = slow.next;
            }
            fast = reverseList(slow.next);
            slow.next = null;
            ListNode cur = head;
            while(cur != null && fast != null){
                ListNode node1 = cur.next;
                ListNode node2 = fast.next;
                cur.next = fast;
                cur = cur.next;
                cur.next = node1;
                cur = cur.next;

                fast = node2;
            }            
        }
        
    }
    
    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode prev = null;
        while(cur != null){
            ListNode temp = cur;
            cur = cur.next;
            temp.next = prev;
            prev = temp;
        }
        return prev;
    }
}