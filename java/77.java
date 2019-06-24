class Solution {
    List<List<Integer>> ans = new ArrayList();
    int k;
    public List<List<Integer>> combine(int n, int k) {
        this.k = k;
        int[] nums = new int[n];
        for(int i = 0;i < n;i++){
            nums[i] = i + 1;
        }
        for(int i = 0;i < n-k+1;i++){
            ArrayList<Integer> path = new ArrayList();
            path.add(nums[i]);
            dfs(i,nums,path);
        }
        return ans;
    }
    
    public void dfs(int pos,int[] nums,ArrayList<Integer> path){
        if(path.size() == k){
            ans.add(path);
        }
        for(int i = pos+1;i < nums.length;i++){
            ArrayList<Integer> tmp = new ArrayList(path);
            tmp.add(nums[i]);
            dfs(i,nums,tmp);
        }
    }
}