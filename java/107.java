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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Deque<TreeNode> nodes = new ArrayDeque();
        List<List<Integer>>ans = new ArrayList();
        if(root == null){
            return ans;
        }
        nodes.add(root);
        while(! nodes.isEmpty()){
            int l = nodes.size();
            List<Integer> temp = new ArrayList<Integer>();
            for(int i = 0;i<l;i++){
                TreeNode node = nodes.pop();
                temp.add(node.val);
                if(node.left != null){
                    nodes.add(node.left);
                }
                if (node.right != null){
                    nodes.add(node.right);
                }
            }
            ans.add(0,temp);
        }
        return ans;
    }
}