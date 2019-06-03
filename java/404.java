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
    int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        findLeft(root);
        return sum;
    }
    public void findLeft(TreeNode node){
        if(node == null){
            return ;
        }
        if(node.left != null){
            if(node.left.left == null &&node.left.right == null){
                sum += node.left.val;
            }
            else{
                findLeft(node.left);
            }
        }
        findLeft(node.right);
    }
}