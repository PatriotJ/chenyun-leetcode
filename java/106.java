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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int l1 = inorder.length;
        int l2 = postorder.length;
        if(l1 != l2){
            return null;
        }
        return helper(inorder,postorder,0,l1-1,0,l1-1);
    }
    
    
    public TreeNode helper(int[] inorder, int[] postorder,int il,int ir,int pl,int pr){
        if(pl > pr){
               return null;
           }
           if(il > ir){
               return null;
           }
        int start = postorder[pr];
        int k = il;
        while(inorder[k] != start){
            k ++;
        }
        int dist = k - il;
        TreeNode root = new TreeNode(start);
        root.left = helper(inorder,postorder,il,k-1,pl,pl+dist-1);
        root.right = helper(inorder,postorder,k+1,ir,pl+dist,pr-1);
        return root;
    }
}