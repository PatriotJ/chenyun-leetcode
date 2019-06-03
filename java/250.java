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
    public int countUnivalSubtrees(TreeNode root) {
        val(root);
        return ans;
    }
    
    public TreeNode val(TreeNode node){
        if(node == null){
            return null;
        }
        if(node.left == null && node.right == null){
            ans ++;
            return node;
        }
        if(node.left == null){
            TreeNode right = val(node.right);
            if(right == null || node.val != right.val){
                return null;
            }
            ans ++;
            return node;
        }
        if(node.right == null){
            TreeNode left = val(node.left);
            if(left == null || node.val != left.val){
                return null;
            }
            ans ++;
            return node;
        }
        TreeNode left = val(node.left);
        TreeNode right = val(node.right);
        if(left == null || right == null || node.val != left.val || node.val != right.val){
            return null;
        }
        ans ++;
        return node;
    }
}