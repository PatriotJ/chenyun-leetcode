/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head == null){
            return null;
        }
        ListNode node1 = new ListNode(-1);
        ListNode n1 = node1;
        ListNode node2 = new ListNode(-1);
        ListNode n2 = node2;
        while(head != null){
            if(head.val < x){
                n1.next = head;
                n1 = n1.next;
            }else{
                n2.next = head;
                n2 = n2.next;
            }
            head = head.next;
        }
        n2.next = null;
        n1.next = node2.next;
        return node1.next;
        
    }
}