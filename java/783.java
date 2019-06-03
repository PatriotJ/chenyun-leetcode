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
    int ans = Integer.MAX_VALUE;
    TreeNode prev = null;
    public int minDiffInBST(TreeNode root) {
        dfs(root);
        return ans;
    }
    public void dfs(TreeNode node){
        if(node != null){
            dfs(node.left);
            if(prev != null){
                ans = Math.min(ans,Math.abs(prev.val - node.val));
            }
            prev = node;
            dfs(node.right);
        }
    }
}