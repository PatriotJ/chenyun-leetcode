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
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        int ans = 0;
        LinkedList<TreeNode> list = new LinkedList();
        Map<TreeNode,Integer> map = new HashMap();
        list.add(root);
        map.put(root,1);
        while(list.size() != 0){
            int l = list.size();
            int lo  = Integer.MAX_VALUE, hi = Integer.MIN_VALUE;
            for(int i = 0; i < l;i++){
                TreeNode node = list.poll();
                int k = map.get(node);
                lo = Math.min(k,lo);
                hi = Math.max(k,hi);
                if(node.left!=null ){
                    list.add(node.left);
                    map.put(node.left,2*k);
                }
                if(node.right != null){
                    list.add(node.right);
                    map.put(node.right,2*k+1);
                }
            }
            ans = Math.max(ans,hi-lo+1);
        }
        return ans;
        
    }
}