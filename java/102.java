/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList();
        LinkedList<TreeNode> tree = new LinkedList();
        if(root == null){
            return list;
        }
        tree.add(root);
        while(tree.size() != 0){
            int l = tree.size();
            List<Integer> tmp = new ArrayList();
            for(int i = 0;i < l;i++){
                TreeNode node = tree.poll();
                tmp.add(node.val);
                if(node.left != null){
                    tree.add(node.left);
                }
                if(node.right != null){
                    tree.add(node.right);
                }
            }
            list.add(tmp);
        }
        return list;
        
    }
}