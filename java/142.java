/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode ptr1 = intersect(head);
        if(ptr1 == null){
            return null;
        }
        
        ListNode ptr2 = head;
        while(ptr1 != ptr2){
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        return ptr1;
    }
    
    
    public ListNode intersect(ListNode head){
        ListNode ptr1 = head;
        ListNode ptr2 = head;
        while(ptr2 !=  null && ptr2.next != null){
            ptr1 = ptr1.next;
            ptr2 = ptr2.next.next;
            if(ptr1 == ptr2){
                return ptr1;
            }
        }
        return null;
    }
}