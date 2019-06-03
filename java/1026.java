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
    public int maxAncestorDiff(TreeNode root) {
        if(root == null){
            return 0;
        }
        return max(root,root.val,root.val);
    }
    
    public int max(TreeNode node, int ma, int mi){
        if(node == null){
            return ma - mi;
        }
        ma = Math.max(ma,node.val);
        mi = Math.min(mi,node.val);
        return Math.max(max(node.left,ma,mi),max(node.right,ma,mi));
    }
}