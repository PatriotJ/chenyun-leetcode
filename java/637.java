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
    public List<Double> averageOfLevels(TreeNode root) {
        Deque<TreeNode> nodes = new ArrayDeque<TreeNode>();
        List<Double>ans = new ArrayList<Double>();
        if(root == null){
            return ans;
        }
        else{
            nodes.add(root);
            while(!nodes.isEmpty()){
                Double sum = 0.0;
                int count = 0;
                int l = nodes.size();
                for(int i = 0;i < l;i++){
                    TreeNode node =  nodes.pop();
                    sum = sum + node.val;
                    count ++;
                    if(node.left != null){
                        nodes.add(node.left);
                    }
                    if(node.right != null){
                        nodes.add(node.right);
                    }
                }
                ans.add(sum/count);
            }
            return ans;
        }
    }
}