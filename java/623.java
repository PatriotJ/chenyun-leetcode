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
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if(root == null || d == 1){
            TreeNode node = new TreeNode(v);
            node.left = root;
            return node;
        }

        int depth = 1;
        LinkedList<TreeNode> queue = new LinkedList();
        queue.add(root);
        while(!queue.isEmpty() && depth++ != d){
            int l = queue.size();
            while(l-- > 0){
                TreeNode node = queue.pop();
                if(depth == d){
                    TreeNode left = node.left;
                    TreeNode right = node.right;
                    node.left = new TreeNode(v);
                    node.right = new TreeNode(v);
                    node.left.left = left;
                    node.right.right = right;
                }else{
                    if(node.left != null){
                        queue.add(node.left);
                    }
                    if(node.right != null){
                        queue.add(node.right);
                    }
                }
            }
        }
        return root;
    }
}