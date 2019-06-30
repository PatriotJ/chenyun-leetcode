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
    class location implements Comparable<location>{
        int x,y,val;
        location(int x,int y,int val){
            this.x = x;
            this.y = y;
            this.val = val;
        }
        public int compareTo(location that){
            if (this.x != that.x)
            return Integer.compare(this.x, that.x);
        else if (this.y != that.y)
            return Integer.compare(this.y, that.y);
        else
            return Integer.compare(this.val, that.val);
        }
    }
    List<location> locations = new ArrayList();
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        dfs(root,0,0);
        Collections.sort(locations);
        List<List<Integer>> ans = new ArrayList();
        ans.add(new ArrayList<Integer>());

        int prev = locations.get(0).x;

        for (location loc: locations) {
            // If the x value changed, it's part of a new report.
            if (loc.x != prev) {
                prev = loc.x;
                ans.add(new ArrayList<Integer>());
            }

            // We always add the node's value to the latest report.
            ans.get(ans.size() - 1).add(loc.val);
        }

        return ans;
    }
    
    public void dfs(TreeNode node,int x,int y){
        if(node != null){
            locations.add(new location(x,y,node.val));
            dfs(node.left,x-1,y+1);
            dfs(node.right,x+1,y+1);
        }
    }
       
    
}