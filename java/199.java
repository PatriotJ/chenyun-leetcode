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
    List<Integer> ans = new ArrayList();
    public List<Integer> rightSideView(TreeNode root) {
        if(root == null){
            return ans;
        }
        LinkedList<TreeNode> queue = new LinkedList();
        queue.add(root);
        while(!queue.isEmpty()){
            int l = queue.size();
            // TreeNode node = queue.pop();
            
            while(l > 0){
                TreeNode node = queue.pop();
                if(l == 1){
                    ans.add(node.val);
                }
                l--;
                if(node.left != null){
                    queue.add(node.left);
                }if(node.right != null){
                    queue.add(node.right);
                }
            }
        }
        return ans;
    }
}