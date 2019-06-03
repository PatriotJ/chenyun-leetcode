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
    public TreeNode constructFromPrePost(int[] pre, int[] post) {
        int N = pre.length;
        if(pre.length == 0){
            return null;
        }
        if(pre.length == 1){
            return new TreeNode(pre[0]);
        }
        TreeNode ans = new TreeNode(pre[0]);
        int id = 0;
        while(post[id] != pre[1]){
            id ++;
        }
        id++;
        ans.left = constructFromPrePost(Arrays.copyOfRange(pre, 1, id+1),
                                         Arrays.copyOfRange(post, 0, id));
        ans.right = constructFromPrePost(Arrays.copyOfRange(pre, id+1, N),
                                          Arrays.copyOfRange(post, id, N-1));
        return ans;
        
    }
    
    
}