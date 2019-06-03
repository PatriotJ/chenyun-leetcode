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
    int tileSum = 0;
    public int findTilt(TreeNode root) {
        dfs(root);
        return tileSum;
    }
    
    public int dfs(TreeNode root){
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        if(root == null){
            return 0;
        }
        else{
            int left = dfs(root.left);
            int right = dfs(root.right);
            if(left > right){
                tileSum += left -right;
            }else{
                tileSum += right -left; 
            }
            return left + right + root.val;
        }
    }
}