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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        depth(root);
        return ans-1;
    }
    public int depth(TreeNode node){
        if(node == null){
            return 0;
        }
        int L = depth(node.left);
        int R = depth(node.right);
        ans = Math.max(L + R + 1,ans);
        return Math.max(L,R)+1;
    }
    
}