class Solution {
    List<List<Integer>> ans = new ArrayList();
    public List<List<Integer>> subsets(int[] nums) {
        int l = nums.length;
        dfs(nums,0,new ArrayList<Integer>());
        return ans;
    }
    
    
    public void dfs(int[] nums,int pos, ArrayList<Integer> path){
        ans.add(path);
        for(int i = pos;i < nums.length;i++){
            ArrayList<Integer> tmp = new ArrayList(path);
            tmp.add(nums[i]);
            dfs(nums,i+1,tmp);
        }
    }
}