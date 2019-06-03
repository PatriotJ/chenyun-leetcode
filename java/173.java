/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class BSTIterator {
    LinkedList<TreeNode> queue = new LinkedList();
    public BSTIterator(TreeNode root) {
        if(root == null){
            return;
        }
        while(root != null){
            queue.add(root);
            // System.out.println(root.val);
            root = root.left;
        }
    }
    
    /** @return the next smallest number */
    public int next() {
        if(hasNext()){
            TreeNode node = queue.pollLast();
            int v = node.val;
            node = node.right;
            while(node != null){
                queue.add(node);
                node = node.left;
            }
            return v;
        }return -1;
    }
    
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !queue.isEmpty();
    }
}
