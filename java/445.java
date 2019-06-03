/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        int x = length(l1);
        int y = length(l2);
        int max = Math.max(x,y);
        int[] x1 = new int[max];
        int[] x2 = new int[max];
        int i = max - x;
        
        while(l1 != null){
            x1[i++] = l1.val;
            l1 = l1.next;
        }
        i = max - y;
        while(l2 != null){
            x2[i++] = l2.val;
            l2 = l2.next;
        }
        int carry = 0;
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        for(i = max - 1;i >= 0;i--){
            int v = x1[i] + x2[i] + carry;
            if(v >= 10){
                v = v - 10;
                carry = 1;
            }else{
                carry = 0;
            }
            cur.next = new ListNode(v);
            cur = cur.next;
        }
        if(carry == 1){
            cur.next = new ListNode(1);
        }
        return reverseList(head.next);
        
    }
    public int length(ListNode l){
        if(l == null){
            return 0;
        }
        return 1 + length(l.next);
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