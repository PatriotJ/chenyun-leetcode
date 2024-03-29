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
    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null){
            return 0;
        }
        if(root.val <= R && root.val >= L){
            return root.val + rangeSumBST(root.left,L,R) + rangeSumBST(root.right,L,R);
        }
        if(root.val < L){
            return rangeSumBST(root.right,L,R);
        }
        return rangeSumBST(root.left,L,R);
    }
}