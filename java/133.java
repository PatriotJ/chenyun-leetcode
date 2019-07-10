/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {}

    public Node(int _val,List<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
};
*/
class Solution {
    Map<Node,Node> map = new HashMap<Node,Node>();
    public Node cloneGraph(Node node) {
        if(node == null){
            return new Node();
        }
        if(map.containsKey(node)){
            return map.get(node);
        }
        List<Node> arr = new ArrayList<Node>();
        Node res = new Node(node.val,arr);
        map.put(node,res);
        for(Node n:node.neighbors){
            arr.add(cloneGraph(n));
        }
        
        return map.get(node);
        
    }
    
}