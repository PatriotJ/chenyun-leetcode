/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {

    /** @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
    ListNode head;
    Random random = new Random();
    int size;
    public Solution(ListNode head) {
        this.head = head;
        size = size(head);
    }
    
    /** Returns a random node's value. */
    public int getRandom() {
        int r = random.nextInt(size);
        ListNode cur = head;
        while( r-- > 0){
            cur = cur.next;
        }
        return cur.val;
    }
    public int size(ListNode node){
        if(node == null){
            return 0;
        }
        return 1 + size(node.next);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */