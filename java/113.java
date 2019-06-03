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
    List<List<Integer>> ans = new LinkedList();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        dfs(root,sum,new LinkedList<Integer>());
        return ans;
    }
    
    public void dfs(TreeNode node,int sum,LinkedList<Integer>path){
        if(node == null){
            return ;
        }
        if(node.left == null && node.right == null && sum == node.val){
            path.add(node.val);
            ans.add(new LinkedList(path));
            path.pollLast();
            return;
        }
        path.add(node.val);
        dfs(node.left,sum-node.val,path);
        dfs(node.right,sum-node.val,path);
        path.pollLast();
    }
}