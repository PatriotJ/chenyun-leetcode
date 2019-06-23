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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        int l = nums.length;
        return helper(nums,0,l-1);
    }
    
    public TreeNode helper(int[] nums,int l,int r){
        if(l > r){
            return null;
        }
        if(l == r){
            return new TreeNode(nums[l]);
        }
        int max = l;
        for(int i = l;i <= r;i++){
            if(nums[i] > nums[max]){
                max = i;
            }
        }
        TreeNode node = new TreeNode(nums[max]);
        node.left = helper(nums,l,max-1);
        node.right = helper(nums,max+1,r);
        return node;
    }
}