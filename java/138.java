
// Definition for a Node.
class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {}

    public Node(int _val,Node _next,Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }
};

class Solution1 {
    HashMap<Node,Node>map = new HashMap();
    public Node copyRandomList(Node head) {
        
        if(head == null){
            return null;
        }
        if(map.containsKey(head)){
            return map.get(head);
        }
        Node node = new Node(head.val,null,null);
        map.put(head,node);
        node.next = copyRandomList(head.next);
        node.random = copyRandomList(head.random);
        return node;
    }
}
class Solution2 {
    HashMap<Node,Node>map = new HashMap();
    public Node copyRandomList(Node head) {
        if(head == null)return null;
        Node old = head;
        Node node = new Node(head.val,null,null);
        map.put(old,node);
        while(old != null){
            Node random = copy(old.random);
            Node next = copy(old.next);
            node.next = next;
            node.random = random;
            old = old.next;
            node = node.next;
            
        }
        return map.get(head);
    }
    public Node copy(Node node){
        if(node != null){
            if(map.containsKey(node)){
                return map.get(node);
            }else{
                map.put(node,new Node(node.val,null,null));
                return map.get(node);
            }
        }
        return null;
    }
}