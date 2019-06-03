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
    Map<TreeNode,Integer> depth = new HashMap();
    int max = 0;
    TreeNode ans;
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        if(root == null){
            return null;
        }
        getDepth(root,1);
        // System.out.println(max);
        return shallowDepth(root);
        // return ans;
    }
    
    public void getDepth(TreeNode node,int i){
        if(node == null){
            return ;
        }
        depth.put(node,i);
        max = Math.max(max,i);
        if(node.left != null){
            getDepth(node.left,i+1);
        }
        if(node.right != null){
            getDepth(node.right,i+1);
        }
    }
    
    public TreeNode shallowDepth(TreeNode node){
        if(node == null || depth.get(node) == max){
            return node;
        }
        TreeNode L = shallowDepth(node.left),
            R = shallowDepth(node.right);
        if( L !=null && R != null){
            return node;
        }if( L !=null){
            return L;
        }if(R != null){
            return R;
        }
        return null;
    }
}