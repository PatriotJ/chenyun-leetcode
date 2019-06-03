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
    List<Integer> ans = new ArrayList<Integer>();
    public List<Integer> postorder(Node root) {
        postAdd(root);
        return ans;
    }
    public void postAdd(Node root){
        if(root == null){
            return;
        }
        for(Node child:root.children){
            postAdd(child);
        }
        ans.add(root.val);
    }
}