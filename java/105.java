/*
* public class TreeNode {
    *     int val;
    *     TreeNode left;
    *     TreeNode right;
    *     TreeNode(int x) { val = x; }
    * }
    */
   class Solution {
       public TreeNode buildTree(int[] preorder, int[] inorder) {
           int l1 = preorder.length;
           int l2 = inorder.length;
           if(l1 != l2){
               return null;
           }
           return helper(preorder,inorder,0,l1-1,0,l2-1);
           
       }
       
       public TreeNode helper(int[] preorder, int[] inorder,int pl,int pr,int il, int ir){
           if(pl > pr){
               return null;
           }
           if(il > ir){
               return null;
           }
           int start = preorder[pl];
           int k = il;
           while(inorder[k] != start){
               k ++;
           }
           int dist = k - il;
           // System.out.println(start);
           TreeNode root = new TreeNode(start);
           TreeNode left = helper(preorder,inorder,pl+1,pl+dist,il,k-1);
           TreeNode right = helper(preorder,inorder,pl+dist+1,pr,k+1,ir);
           root.left = left;
           root.right = right;
           return root;
       }
   }