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
    HashMap<Integer,Integer> map = new HashMap();
    // int sum = Integer.MIN_VALUE;
    public boolean checkEqualTree(TreeNode root) {
        int sum = dfs(root);
        // System.out.println(sum);
        if(sum % 2 != 0){
            return false;
        }
        if(sum == 0){
            return map.get(0) > 1;
        }
        
        return map.getOrDefault(sum/2,0) > 0;
    }
    
    public int dfs(TreeNode node){
        if(node == null){
            return 0;
        }
        int left = dfs(node.left);
        int right = dfs(node.right);
        int val = node.val+left+right;
        // sum = val;
        int k = map.getOrDefault(val,0);
        map.put(val,k+1);
        return val;
    }
}