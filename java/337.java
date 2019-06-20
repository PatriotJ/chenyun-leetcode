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
    public int rob(TreeNode root) {
        int[] v = dfs(root);
        return Math.max(v[0],v[1]);
    }
    public int[] dfs(TreeNode root){
        if(root == null){
            return new int[2];
        }
        int[] left = dfs(root.left);
        int[] right = dfs(root.right);
        int l1 = left[0],l2 = left[1],r1 = right[0],r2 = right[1];
        int val = root.val + l2 + r2;
        int top = Math.max(l2,l1) + Math.max(r1,r2);
        return new int[]{val,top};
    }
}