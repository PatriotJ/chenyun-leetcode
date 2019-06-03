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
    int max  = 0;
    Map<Integer,Integer>map = new HashMap();
    public int[] findFrequentTreeSum(TreeNode root) {
        dfs(root);
        if(max == 0){
            return new int[0];
        }else{
            List<Integer> x = new ArrayList();
            for(int i:map.keySet()){
                if(map.get(i) == max){
                    x.add(i);
                }
            }
            int[] ans = new int[x.size()];
            int j = 0;
            for(int i:x){
                ans[j++] = i;
            }
            return ans;
        }
    }
    
    public int dfs(TreeNode root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            int n = root.val;
            int freq = map.getOrDefault(n,0)+1;
            map.put(n,freq);
            max = Math.max(max,freq);
            return n;
        }
        int l = dfs(root.left);
        int r = dfs(root.right);
        int n = root.val + l + r;
        int freq = map.getOrDefault(n,0)+1;
        map.put(n,freq);
        max = Math.max(max,freq);
        return n;
        
    }
}