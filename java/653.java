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
    public boolean findTarget(TreeNode root, int k) {
        List<Integer>lst = new ArrayList();
        inorder(root,lst);
        int l = 0,r = lst.size()-1;
        while(l < r){
            int sum = lst.get(l) + lst.get(r);
            if(sum == k){
                return true;
            }
            if(sum > k){
                r --;
            }else{
                l ++;
            }
        }
        return false;
        
    }
    
    public void inorder(TreeNode root,List<Integer>lst){
        if(root == null){
            return;
        }
        inorder(root.left,lst);
        lst.add(root.val);
        inorder(root.right,lst);
    }
}