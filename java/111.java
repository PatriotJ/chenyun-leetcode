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
    int min = Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        depth(root,0);
        return min;
    }
    public void depth(TreeNode root,int de){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            min = Math.min(min,de+1);
            return;
        }
        depth(root.left,de+1);
        depth(root.right,de+1);
    }
}