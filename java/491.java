class Solution {
    Set<List<Integer>> ans = new HashSet();
    public List<List<Integer>> findSubsequences(int[] nums) {
        for(int i = 0;i < nums.length;i++){
            ArrayList<Integer> path = new ArrayList();
            path.add(nums[i]);
            dfs(i,nums,path);
        }
        // dfs(0,nums,new ArrayList());
        return new ArrayList(ans);
        
    }
    public void dfs(int pos, int[] nums,ArrayList<Integer> path){
        if(path.size() >= 2){
            ans.add(path);
        }
        // path.add(nums[pos]);
        for(int i = pos+1;i < nums.length;i++){
            if(nums[i]>=nums[pos]){
                ArrayList<Integer> tmp = new ArrayList(path);
                tmp.add(nums[i]);
                dfs(i,nums,tmp);
            }
        }
    }
    
    
}