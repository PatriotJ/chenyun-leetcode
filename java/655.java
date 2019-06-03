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
    int depth;
    List<List<String>> ans = new ArrayList();
    public List<List<String>> printTree(TreeNode root) {
        int depth = getDepth(root); 
        String[][] res = new String[depth][(1<<depth)-1];
        for(String[] arr:res){
            Arrays.fill(arr,"");
        }
        fill(res,root,0,0,res[0].length);
        for(String[] arr:res){
            ans.add(Arrays.asList(arr));
            
        }
        return ans;
    }
    
    public void fill(String[][] res,TreeNode root,int i,int l,int r){
        if(root == null){
            return;
        }
        res[i][(l+r)/2] = ""+root.val;
        fill(res,root.left,i+1,l,(l+r)/2);
        fill(res,root.right,i+1,(l+r+1)/2,r);
    }
    
    public int getDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        return 1 + Math.max(getDepth(root.left),getDepth(root.right));
    }
}