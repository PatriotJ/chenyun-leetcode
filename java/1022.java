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
    public int sumRootToLeaf(TreeNode root) {
        return sum(root,0);
    }
    
    public int sum(TreeNode root,int cur){
        int sum = 0;
        if(root == null){
            return 0;
        }
        cur = cur * 2 + root.val;
        if(root.left == null && root.right == null){
            return cur;
        }
        if(root.left != null){
            sum = sum + sum(root.left,cur);
        }
        if(root.right != null){
            sum = sum + sum(root.right,cur);
        }
        return sum;
    }
}