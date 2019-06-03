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
    public List<Integer> preorder(Node root) {
        // if(root == null){
        //     return ;
        // }
        add(root);
        return ans;
    }
    public void add(Node root){
        if(root == null){
            return;
        }
        ans.add(root.val);
        for(Node child:root.children){
            add(child);
        }
    } 
    
}