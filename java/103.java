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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList();
        LinkedList<TreeNode> tree = new LinkedList();
        if(root == null){
            return list;
        }
        int j = 0;
        tree.add(root);
        while(tree.size() != 0){
            int l = tree.size();
            List<Integer> tmp = new ArrayList();
            LinkedList<TreeNode>tree2 = new LinkedList();
            for(int i = 0;i < l;i++){
                
                if(j % 2 == 0){
                    TreeNode node = tree.poll();
                    tmp.add(node.val);
                    if(node.left != null){
                    tree2.add(node.left);
                }
                if(node.right!=null){
                    tree2.add(node.right);
                }
                }else{
                    TreeNode node = tree.pollLast();
                    tmp.add(node.val);
                    if(node.right != null){
                        tree2.offerFirst(node.right);
                    }
                    if(node.left!=null){
                        tree2.offerFirst(node.left);
                    }
                } 
            }
            j ++;
            list.add(tmp);
            tree = tree2;
        }
        return list;
    }
}