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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if(root1 != null && root2 != null){
            ArrayList<Integer> leaf1 = new ArrayList<Integer>();
            ArrayList<Integer> leaf2 = new ArrayList<Integer>();
            dfs(root1,leaf1);
            dfs(root2,leaf2);
            return leaf1.equals(leaf2);
        }
        return false;
    }
    
    public void dfs(TreeNode root, ArrayList<Integer> leaf){
        if(root == null){
            return ;
        }
        if(root.left == null && root.right == null){
            leaf.add(root.val);
        }
        dfs(root.left,leaf);
        dfs(root.right,leaf);
            
    }
}