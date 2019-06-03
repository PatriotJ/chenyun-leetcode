/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class CBTInserter {
    TreeNode root;
    LinkedList<TreeNode> deque = new LinkedList();
    public CBTInserter(TreeNode root) {
        this.root = root;
        LinkedList<TreeNode> queue = new LinkedList();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.pop();
            if(node.left == null && node.right == null){
                deque.add(node);
            }
            if(node.left != null){
                if(node.right == null){
                    deque.add(node);
                }
                queue.add(node.left);
            }
            if(node.right != null){
                queue.add(node.right);
            }
        }
        
    }
    
    public int insert(int v) {
        TreeNode node = deque.peek();
        TreeNode n = new TreeNode(v);
        if(node.left == null){
            node.left = n;
        }else{
            node.right = n;
            deque.pop();
        }
        deque.add(n);
        return node.val;
    }
    
    public TreeNode get_root() {
        return this.root;
    }
    
    // public void 
}