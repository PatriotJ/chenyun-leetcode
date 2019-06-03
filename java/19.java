/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int m = getSize(head);
        // System.out.println(m);
        int j = m - n - 1;
        ListNode cur = head;
        if(j < 0){
            return head.next;
        }
        while(j > 0){
            cur = cur.next;
            j--;
        }
        cur.next = cur.next.next;
        return head;
    }
    
    public int getSize(ListNode node){
        if(node == null){
            return 0;
        }
        return 1 + getSize(node.next);
    }
}

class Solution2 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode  slow = head,fast = head;
        while(n > 0){
            fast = fast.next;
            n--;
        }
        if(fast == null){
            return head.next;
        }
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    
    
}