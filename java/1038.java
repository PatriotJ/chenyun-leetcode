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
    int add = 0;
    public TreeNode bstToGst(TreeNode root) {
        dfs(root);
        return root;
    }
    public void dfs(TreeNode node){
        if(node != null){
            dfs(node.right);
            node.val += add;
            add = node.val;
            dfs(node.left);
        }
    }
}