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
    int ans = 0;
    public int longestConsecutive(TreeNode root) {
        helper(root,1);
        return ans;
    }
    public void helper(TreeNode root,int k){
        if(root == null){
            return;
        }
        if(root.left != null && root.left.val == root.val + 1){
            ans = Math.max(ans,k+1);
            helper(root.left,k+1);
        }else{
            ans = Math.max(ans,k);
            helper(root.left,1);
        }
        if(root.right != null && root.right.val == root.val + 1){
            ans = Math.max(ans,k+1);
            helper(root.right,k+1);
        }else{
            ans = Math.max(ans,k);
            helper(root.right,1);
        } 
    }
}