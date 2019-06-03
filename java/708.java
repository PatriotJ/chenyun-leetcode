
// Definition for a Node.
class Node {
    public int val;
    public Node next;

    public Node() {}

    public Node(int _val,Node _next) {
        val = _val;
        next = _next;
    }
};

class Solution {
    public Node insert(Node head, int insertVal) {
        Node node = new Node(insertVal,null);
        if(head == null){
            node.next = node;
            return node;
        }
        Node cur = head;
        int c  = 0;
        while(true){
            // cur = cur.next;
            if(cur.val <= node.val && node.val <= cur.next.val || (cur.val > cur.next.val) &&(cur.val <= node.val || cur.next.val >= node.val) || c != 0 &&  cur == head){
                Node node2 = cur.next;
                node.next = node2;
                cur.next = node;
                break;
            }
            cur = cur.next;
            c ++;
        }
        // while()
        return head;
    }
    
    
}