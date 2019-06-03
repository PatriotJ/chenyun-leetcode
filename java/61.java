/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        int size = size(head);
        if(size == 0){
            return null;
        }
        k = size - k % size;
        if(k % size == 0){
            return head;
        }
        ListNode cur = head;
        while(k > 1 ){
            cur = cur.next;
            k -- ;
        }
        // System.out.println(cur.val);
        ListNode pre = cur.next;
        cur.next = null;
        cur = pre;
        while(cur.next != null){
            cur = cur.next;
        }
        cur.next = head;
        return pre;

    }
    
    public int size(ListNode node){
        if(node == null){
            return 0;
        }
        return 1 + size(node.next);
    }
}