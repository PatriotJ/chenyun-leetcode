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
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(root == null){
            return ans;
        }
        
        Deque<Node> nodes = new ArrayDeque();
        nodes.add(root);
        while(!nodes.isEmpty()){
            int l = nodes.size();
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for(int i = 0;i < l;i++){
                Node node = nodes.pop();
                temp.add(node.val);
                for(Node child:node.children){
                    nodes.add(child);
                }
            }
            ans.add(temp);
        }
        return ans;
    }
}