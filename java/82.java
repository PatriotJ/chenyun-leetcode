/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    Set<Integer> map = new HashSet<Integer>();
    public ListNode deleteDuplicates(ListNode head) {

        ListNode node = head;
        while(node != null && node.next!=null){
            if(node.val == node.next.val){
                // System.out.println(node.val);
                map.add(node.val);
            }
            node = node.next;
        }
        return helper(head);
        
    }
    public ListNode helper(ListNode head){
        if(head == null){
            return null;
        }
        if(map.contains(head.val)){
            return helper(head.next);
        }
        ListNode cur = head;
        while(cur.next!=null && !map.contains(cur.next.val)){
            cur = cur.next;
        }
        cur.next = helper(cur.next);
        return head;
    }
}

class Solution2 {
    // Set<Integer> map = new HashSet<Integer>();
    public ListNode deleteDuplicates(ListNode head) {

        ListNode curr = head;
        ListNode newlist = new ListNode(0);
        newlist.next = head;
        ListNode newhead = newlist;
        while(curr != null)
        {
            while(curr.next != null && curr.val == curr.next.val)
                curr = curr.next;
            if(newhead.next == curr)
                newhead = newhead.next;
            else
                newhead.next = curr.next;
            curr = curr.next;
        }
        return newlist.next;
        
    }
    
}