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
    public int sumNumbers(TreeNode root) {
        if(root == null){
            return 0;
        }
        add(root,0);
        return ans;
    }
    
    public void add(TreeNode root,int sum){
        if(root.left == null && root.right == null){
            ans += 10*sum+root.val;
        }
        if(root.left != null){
            add(root.left,sum*10+root.val);
        }
        if(root.right != null){
            add(root.right,sum*10+root.val);
        }
    }
    
}