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
    List<String>ans = new ArrayList();
    public List<String> binaryTreePaths(TreeNode root) {
        // StringBuilder s = new StringBuilder();
        String s = "";
        dfs(root,s);
        return ans;
    }
    
    public void dfs(TreeNode root, String s){
        if(root == null){return;}
        s += root.val;
        if(root.left == null && root.right == null){
            
            ans.add(s);
        }
        if(root.left != null){
        dfs(root.left,s+"->");
        }
        if(root.right != null){
        dfs(root.right,s+"->");
        }
    }
}