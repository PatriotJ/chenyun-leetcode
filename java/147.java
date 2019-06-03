/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {
        if(head == null){
            return null;
        }
        // Node cur = new Node(head.val);
        ListNode cur = null;
        while(head != null){
            cur = helper(cur,head.val);
            head =head.next;
        }
        return cur;
    }
    
    public ListNode helper(ListNode node,int val){
        if(node == null){
            return new ListNode(val);
        }
        ListNode tmp = new ListNode(val);
        if(val < node.val){
            tmp.next = node;
            return tmp;
        }
        ListNode start = node;
        while(node.next != null && node.next.val <= val){
            node = node.next;
        }
        tmp.next = node.next;
        node.next = tmp;
        return start;
    }
}