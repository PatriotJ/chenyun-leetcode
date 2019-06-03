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
    int size = 0;
    int index = 0;
    public boolean isCompleteTree(TreeNode root) {
        if(root == null){
            return true;
        }
        put(root,1);
        return size == index;
    }
    
    public void put(TreeNode node,int i){
        if(node == null){
            return;
        }
        size++;
        index = Math.max(index,i);
        put(node.left,i*2);
        put(node.right,i*2+1);
    }
}