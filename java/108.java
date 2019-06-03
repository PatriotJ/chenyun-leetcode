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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0){
            return null;
        }
        int l = nums.length;
        int lo = 0;
        int hi = l-1;
        // int mid = l/2;
        
        return toBST(nums,lo,hi);
    }
    public TreeNode toBST(int[] nums,int lo,int hi){
        if(lo > hi){
            return null;
        }
        if(lo == hi){
            return new TreeNode(nums[lo]);
        }
        int mid = (lo+hi)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = toBST(nums,lo,mid-1);
        root.right = toBST(nums,mid+1,hi);
        return root;
    }
}