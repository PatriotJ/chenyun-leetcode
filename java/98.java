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
    public boolean isValidBST(TreeNode root) {
        return valid(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    
    public boolean valid(TreeNode root ,long min,long max){
        if(root == null){
            return true;
        }
        if(root.val > min && root.val < max){
            return valid(root.left,min,root.val) && valid(root.right,root.val,max);
        }else{
            return false;
        }
    }
}