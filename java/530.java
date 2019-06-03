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
    public int getMinimumDifference(TreeNode root) {
        // System.out.println(ans);
        dfs(root);
        return (int)ans;
    }
    
    public void dfs(TreeNode root){
        if(root != null){
            dfs(root.left);
           if(prev != null){
               ans = Math.min(ans,Math.abs(root.val - prev.val));
           }
            prev = root;
            dfs(root.right);
        }
    }
}