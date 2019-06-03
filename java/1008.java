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
    public class TreeNode {
             int val;
             TreeNode left;
             TreeNode right;
             TreeNode(int x) { val = x; }
         }
    public TreeNode bstFromPreorder(int[] preorder) {
        if (preorder ==null || preorder.length == 0){
            return null;
        }
        int l = preorder.length;
        TreeNode root = new TreeNode(preorder[0]);
        Stack<TreeNode> stack = new Stack();
        stack.add(root);
        for(int i = 1; i < l;i++){
            TreeNode node = stack.peek();
            TreeNode child = new TreeNode(preorder[i]);
            while (!stack.empty() && stack.peek().val < child.val){
                node = stack.pop();
            }
            if(node.val < child.val){
                node.right = child;
            }else{
                node.left = child;
            }
        }
        stack.add(child);
        return root;
    }
}