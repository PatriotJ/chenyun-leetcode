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
    Map<String,Integer> map ;
    List<TreeNode> nodes;
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        map = new HashMap();
        nodes = new ArrayList();
        helper(root);
        return nodes;
    }
    public String helper(TreeNode node){
        if(node == null){
            return " ";
        }
        String left = helper(node.left);
        String right = helper(node.right);
        String cur = node.val + left + right;
        int k = map.getOrDefault(cur,0);
        if(k == 1){
            nodes.add(node);
        }
        map.put(cur,k+1);
        return cur;
    }
}