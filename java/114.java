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
    public void flatten(TreeNode root) {
        if(root == null){
            return ;
        }
        TreeNode left = root.left;
        flatten(left);
        TreeNode right = root.right;
        flatten(right);
        root.left = null;
        root.right = left;
        TreeNode tmp = root;
        while(tmp.right != null){
            tmp = tmp.right;
        }
        tmp.right = right;
    }
}