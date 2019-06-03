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
    public int findBottomLeftValue(TreeNode root) {
        TreeNode ans = root;
        // if(root == null){
        //     return ans;
        // }
        LinkedList<TreeNode> queue = new LinkedList();
        queue.add(root);
        while(!queue.isEmpty()){
            int l = queue.size();
            // System.out.println(l);
            int max = Integer.MIN_VALUE;
            for(int i = 0 ;i < l;i++){
                
                TreeNode node = queue.poll();
                if(i == 0){
                    ans = node;
                }
                // System.out.println(node.val);
                max = Math.max(max,node.val);
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            // ans.add(max);
        }
        return ans.val;
    }
    
}