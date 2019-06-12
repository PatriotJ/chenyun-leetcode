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
    public List<TreeNode> generateTrees(int n) {
        if(n == 0){
            return new ArrayList<TreeNode>();
        }
        return helper(1,n);
    }
    
    public List<TreeNode> helper(int l,int r){
        List<TreeNode> trees = new ArrayList();
        if(l > r){
            trees.add(null);
            return trees;
        }
        for(int i = l;i <= r;i++ ){
            List<TreeNode>left = helper(l,i-1);
            List<TreeNode>right = helper(i+1,r);
            for(TreeNode nl:left){
                for(TreeNode nr:right){
                    TreeNode cur = new TreeNode(i);
                    cur.left = nl;
                    cur.right = nr;
                    trees.add(cur);
                }
            }
        }
        return trees;
    }
}