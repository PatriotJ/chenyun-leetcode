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
        ArrayList<Integer> array = new ArrayList();
        // l1 = reverseList(l1);
        // l2 = reverseList(l2);
        int carry = 0;
        while(l1 != null && l2 != null){
            int x = carry+l1.val+l2.val;
            if(x >= 10){
                x = x - 10;
                carry = 1;
            }else{
                carry = 0;
            }
            array.add(x);
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null){
            int x = carry+l1.val;
            if(x >= 10){
                x = x - 10;
                carry = 1;
            }else{
                carry = 0;
            }
            array.add(x);
            l1 = l1.next;
        }
        while(l2 != null){
            int x = carry+l2.val;
            if(x >= 10){
                x = x - 10;
                carry = 1;
            }else{
                carry = 0;
            }
            array.add(x);
            l2 = l2.next;
        }
        if(carry > 0){
            array.add(carry);
        }
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        for(int i = 0;i < array.size();i++){
            cur.next = new ListNode(array.get(i));
            cur = cur.next;
        }
        return head.next;
    }
}