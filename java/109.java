/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    List<Integer> tmp = new ArrayList();
    public TreeNode sortedListToBST(ListNode head) {
        int i = getSize(head);
        System.out.println(i);
        if(i == 0){
            return null;
        }else{
            return insert(tmp,0,i-1);
        }
    }
    
    public int getSize(ListNode head){
        if(head == null){
            return 0;
        }
        tmp.add(head.val);
        return 1 + getSize(head.next);
    }
    
    public TreeNode insert(List<Integer> tmp,int l,int r){
        int mid = (l+r)/2;
        if(l < r){
            
            TreeNode node = new TreeNode(tmp.get(mid));
            node.left = insert(tmp,l,mid-1);
            node.right = insert(tmp,mid+1,r);
            return node;
        }
        if(l == r){
            return new TreeNode(tmp.get(mid));
        }
        return null;
    }
}