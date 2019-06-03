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
    int maxFreq = 0;
    Map<Integer,Integer>freq = new HashMap<Integer,Integer>();
    public int[] findMode(TreeNode root) {
        dfs(root);
        List<Integer>ans = new ArrayList();
        for(int key:freq.keySet()){
            if(freq.get(key) == maxFreq){
                ans.add(key);
            }
        }
        int[] a = new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            a[i] = ans.get(i);
        }
        return a;
    }
    
    public void dfs(TreeNode root){
        if(root == null){
            return;
        }
        int val = freq.getOrDefault(root.val, 0);
        freq.put(root.val,val+1);
        maxFreq = Math.max(maxFreq,val+1);
        dfs(root.left);
        dfs(root.right);
    }
}