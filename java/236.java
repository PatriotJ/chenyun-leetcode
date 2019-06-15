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
    TreeNode ans = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        rec(root,p,q);
        return ans;
    }
    
    public boolean rec(TreeNode root, TreeNode p, TreeNode q){
        if(root == null){
            return false;
        }
        int left = rec(root.left,p,q) ? 1 : 0;
        int right = rec(root.right,p,q) ? 1 : 0;
        int mid = (root.val == p.val || root.val == q.val) ? 1:0;
        if(left + right + mid >= 2){
            ans = root;
        }
        return left + right + mid > 0;
    }
}