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
    int close;
    double dist = Double.MAX_VALUE;
    public int closestValue(TreeNode root, double target) {
        if(root == null){
            return 0;
        }
        dfs(root,target);
        return close;
    }
    
    public void dfs(TreeNode root,double target){
        if(root == null){
            return;
        }
        if(root.val == target){
            close = root.val;
            return;
        }
        if(root.val > target){
            if(root.val - target < dist){
                dist = root.val - target;
                close = root.val;
                
            }
            dfs(root.left,target);
        }
        if(root.val < target){
            if(target - root.val < dist){
                dist = target - root.val;
                close = root.val;
                
            }
            dfs(root.right,target);
        }
    }
}