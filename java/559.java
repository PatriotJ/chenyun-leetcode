/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public int maxDepth(Node root) {
        if(root == null){
            return 0;
        }
        int depth = 1;
        int subDepth = 0;
        for(Node child:root.children){
            int d = maxDepth(child);
            subDepth = Math.max(d,subDepth);
        }
        return depth + subDepth;
    }
}