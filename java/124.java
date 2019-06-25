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
    int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if(root == null){
            return 0;
        }
        helper(root);
        return ans;
    }
    
    public int helper(TreeNode root){
        if(root == null){
            return 0;
        }
        ans = Math.max(root.val,ans);
        int left = helper(root.left);
        int right = helper(root.right);
        int v = root.val;
        if(left < 0 && right < 0){
            // v += Math.max(right,left);
            ans = Math.max(v,ans);
            return Math.max(ans,0);
        }
        if(left >= 0){
            v += left;
        }
        if(right >= 0){
            v += right;
        }
        ans = Math.max(v,ans);
        return Math.max(Math.max(left,right) + root.val,0);
    }
}