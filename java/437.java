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
    public int pathSum(TreeNode root, int sum) {
        if(root == null)return 0;
        return path(root,sum) + pathSum(root.left,sum) + pathSum(root.right,sum);
    }
    public int path(TreeNode root,int s){
        if(root == null){
            return 0;
        }
        
        int x = path(root.left,s-root.val)+ path(root.right,s-root.val);
        if(root.val == s){
            x ++;
        }
        return x;
        
    }
}