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
    int min;
    long secondMin = Long.MAX_VALUE;
    public int findSecondMinimumValue(TreeNode root) {
        min = root.val;
        dfs(root);
        if(secondMin == Long.MAX_VALUE){
            return -1;
        }
        return (int)secondMin;
    }
    public void dfs(TreeNode node){
        if(node == null){
            return;
        }
        if(min < node.val && node.val < secondMin){
            secondMin = node.val;
        }
        dfs(node.left);
        dfs(node.right);
    }
}