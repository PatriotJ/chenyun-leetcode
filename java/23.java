/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        
        int size = lists.length;
        if(size == 0){
            return null;
        }
        int interval = 1;
        while(interval < size){
            for (int i = 0;i < size - interval;i = i + interval*2){
                lists[i] = mergeTwoLists(lists[i],lists[i+interval]);
            }
            interval = interval * 2;
        }
        return lists[0];
        
    }
    
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null){
            return null;
        }
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        ListNode cur = new ListNode(0);
        if(l1.val < l2.val){
            cur.next = l1;
            cur.next.next = mergeTwoLists(l1.next,l2);
        }else{
            cur.next = l2;
            cur.next.next = mergeTwoLists(l2.next,l1);
        }
        return cur.next;
        
    }
}