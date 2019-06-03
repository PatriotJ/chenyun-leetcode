/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode[] splitListToParts(ListNode root, int k) {
        int size = size(root);
        ListNode[] ans = new ListNode[k];
        if(root == null){
            return ans;
        }
        int each = size / k;
        // System.out.println(each);
        int num = size % k;
        int i = 0;
        while(root != null){
            ListNode cur = root;
            if(num > 0){
                for(int j = 0;j < each;j++){
                    root = root.next;
                }
                ListNode temp = root.next;
                root.next = null;
                root = temp;
                ans[i] = cur;
                num--;
                i++;
            }else{
                for(int j = 1;j < each;j++){
                    root = root.next;
                }
                ListNode temp = root.next;
                root.next = null;
                root = temp;
                ans[i] = cur;
                // num--;
                i++;
            }
        }
        return ans;
        
        
        
    }
    public int size(ListNode root){
        if(root == null){
            return 0;
        }
        return 1 + size(root.next);
    }
}