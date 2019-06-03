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
    List<Integer>ans = new LinkedList();
    public List<Integer> preorderTraversal(TreeNode root) {
        preorder(root);
        return ans;
    }
    public void preorder(TreeNode root){
        if(root == null){
            return;
        }
        ans.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }
}