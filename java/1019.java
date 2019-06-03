/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> list = get(head);
        int size = list.size();
        if(size == 0){
            return new int[0];
        }
        int[] ans = new int[size];
        LinkedList<int[]> stack = new LinkedList();
        // int i = 0;
        for(int i = 0;i < size;i++){
            while(!stack.isEmpty() && stack.peekLast()[1] < list.get(i)){
                int[] temp = stack.pollLast();
                
                ans[temp[0]] = list.get(i);
            }
            stack.add(new int[]{i,list.get(i)});
        }
        return ans;
    }
    
    public List<Integer> get(ListNode head){
        ArrayList<Integer> list = new ArrayList();
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        return list;
    }
}