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
    public int longestUnivaluePath(TreeNode root) {
        arrowLength(root);
        return ans;
    }
    
    public int arrowLength(TreeNode node){
        if(node == null)return 0;
        int left = arrowLength(node.left);
        int right = arrowLength(node.right);
        int arrowL = 0,arrowR = 0;
        if(node.left!=null&&node.left.val == node.val){
            arrowL = left + 1;
        }
        if(node.right!=null&&node.right.val==node.val){
            arrowR = right + 1;
        }
        ans = Math.max(ans,arrowL+arrowR);
        return Math.max(arrowL,arrowR);
    }
    
    
}