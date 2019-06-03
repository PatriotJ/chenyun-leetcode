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
    public TreeNode insertIntoMaxTree(TreeNode root, int val) {
        if(root == null){
            return new TreeNode(val);
        }else{
            if(root.val < val){
                TreeNode node = new TreeNode(val);
                node.left = root;
                return node;
            }else{
                root.right = insertIntoMaxTree(root.right,val);
                return root;
            }
        }
    }
}