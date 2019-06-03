/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;

    public Node() {}

    public Node(int _val,Node _prev,Node _next,Node _child) {
        val = _val;
        prev = _prev;
        next = _next;
        child = _child;
    }
};
*/
class Solution {
    public Node flatten(Node head) {
        if(head == null){
            return null;
        }
        Node cur = head;
        while(cur != null && cur.child == null){
            cur = cur.next;
        }
        if(cur == null){
            return head;
        }
        Node child = flatten(cur.child);
        Node next = flatten(cur.next);
        cur.child = null;
        cur.next = child;
        if(child != null){
            child.prev = cur;   
        }
        
        while(cur.next != null){
            cur = cur.next;
        }
        cur.next = next;
        if(next != null){
            next.prev = cur;
        }
        return head;
    }
}