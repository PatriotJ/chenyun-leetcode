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
    List<Integer> ans = new LinkedList();
    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return ans;
    }
    
    public void inorder(TreeNode node){
        if(node == null){
            return;
        }
        inorder(node.left);
        ans.add(node.val);
        inorder(node.right);
    }
}