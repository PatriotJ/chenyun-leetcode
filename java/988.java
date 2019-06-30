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
    
    String ans = "{";
    public String smallestFromLeaf(TreeNode root) {
        if(root == null){
            return "";
        }
        dfs(root,"");
        return ans;
    }
    
    public void dfs(TreeNode node,String s){
        if(node == null){
            return;
        }
        char c = (char)('a'+node.val);
        if(node.left == null && node.right == null){
            if(ans.compareTo(c+s) > 0){
                ans = c+ s ;
            }
        }
        dfs(node.left,c+s);
        dfs(node.right,c+s);
        
    }
}