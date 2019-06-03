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
    Map<Integer,Integer> depth = new HashMap();
    Map<Integer,Integer> parent = new HashMap();
    public boolean isCousins(TreeNode root, int x, int y) {
        dfs(root,null);
        return depth.get(x) == depth.get(y) && parent.get(x) != parent.get(y);
    }
    
    public void dfs(TreeNode child,TreeNode par){
        if(child != null){
            if(par == null){
                depth.put(child.val,0);
                parent.put(child.val,-1);
            }else{
                depth.put(child.val,depth.get(par.val)+1);
                parent.put(child.val,par.val);
            }
            
            dfs(child.left,child);
            dfs(child.right,child);
        }
        
    }
}