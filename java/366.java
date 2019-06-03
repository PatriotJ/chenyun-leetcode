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
    Map<Integer,List<Integer>> map = new HashMap();
    public List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> ans = new ArrayList();
        if(root == null){
            return ans;
        }
        dfs(root);
        for(Integer i: map.keySet()){
            // System.out.println(i);
            ans.add(map.get(i));
        }
        return ans;
    }
    
    public int dfs(TreeNode node){
        if(node == null){
            return 0;
        }else if(node.left == null && node.right == null){
            if(!map.containsKey(1)){
                ArrayList<Integer> list = new ArrayList();
                list.add(node.val);
                map.put(1,list);
            }
            else{
                List list = map.get(1);
                list.add(node.val);
                map.put(1,list);
            }
            return 1;
        }
        int L = dfs(node.left);
        int R = dfs(node.right);
        int J = Math.max(L,R)+1;
        if(!map.containsKey(J)){
                ArrayList<Integer> list = new ArrayList();
                list.add(node.val);
                map.put(J,list);
            }
            else{
                List list = map.get(J);
                list.add(node.val);
                map.put(J,list);
            }
            return J;
    }
}