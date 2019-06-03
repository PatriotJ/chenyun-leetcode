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
    boolean flag = true;
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        depth(root);
        return flag;
        
    }
    public int depth(TreeNode root){
        if(root == null){
            return 0;
        }
        int l = depth(root.left);
        int r = depth(root.right);
        if(l - r > 1 || r - l > 1){
            flag = false;
        }
        return Math.max(l,r) + 1;
    }
}