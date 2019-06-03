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
    public String tree2str(TreeNode t) {
        if(t == null){
            return "";
        }
        String s = t.val + "";
        if(t.left == null && t.right == null){
            return s;
        }
        if(t.left != null){
            s = s + "(" + tree2str(t.left) + ")";
        }else{
            s = s + "()";
        }
        if(t.right != null){
            s = s + "(" + tree2str(t.right) + ")";
        }
        return s;
    }
}