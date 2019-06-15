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
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if(root == null){
            return null;
        }
        if(p.val > root.val){
            return inorderSuccessor(root.right,p);
        }
        else if(p.val == root.val){
            if(root.right == null){
                return null;
            }else{
                TreeNode right = root.right;
                while(right.left != null){
                    right = right.left;
                }
                return right;
            }
        }else{
            TreeNode t = inorderSuccessor(root.left,p);
            if(t == null){
                return root;
            }else{
                return t;
            }
        }
    }
}