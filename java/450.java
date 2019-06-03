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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null){
            return null;
        }
        if(root.val < key){
            root.right = deleteNode(root.right,key);
            return root;
        }
        if(root.val > key){
            root.left = deleteNode(root.left,key);
            return root;
        }
        if(root.left == null){
            return root.right;
        }
        if(root.right == null){
            return root.left;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;
        TreeNode tmp = left;
        while(tmp.right != null){
            tmp = tmp.right;
        }
        tmp.right = right;
        return left;
    }

}