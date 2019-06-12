
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val,Node _left,Node _right,Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};

class Solution {
    public Node connect(Node root) {
        if(root == null){
            return root;
        }
        LinkedList<Node>list = new LinkedList();
        Node res = root;
        list.add(root);
        while(list.size() != 0){
            int l = list.size();
            while(l > 0){
                Node node = list.poll();
                if(l == 1){
                    node.next = null;
                }else{
                    node.next = list.peek();
                }
                if(node.left != null){
                    list.add(node.left);
                }
                if(node.right != null){
                    list.add(node.right);
                }
                l --;
            }
        }
        return res;
    }
}