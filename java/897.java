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
    public TreeNode increasingBST(TreeNode root) {
        if(root == null || (root.left == null && root.right == null)){
            return root;
        }else{
            TreeNode right = increasingBST(root.right);
            TreeNode left = increasingBST(root.left);
            root.left = null;
            root.right = right;
            if(left != null){
                TreeNode temp = left;
                while (temp != null && temp.right != null){
                    temp = temp.right;
                }
                temp.right = root;
                return left;
            }
            return root;
            }
        }
    
}