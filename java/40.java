class Solution {
    List<List<Integer>> list = new ArrayList();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        dfs(candidates,target,new ArrayList(),0);
        return list;
    }
    public void dfs(int[] nums, int remain,List<Integer> path,int pos){
        if(remain < 0){
            return;
        }
        else if(remain == 0){
            list.add(new ArrayList(path));
        }else{
            for(int i = pos;i < nums.length;i++){
                if(i > pos && nums[i] == nums[i-1]){
                    continue;
                }else{
                    ArrayList<Integer> newPath = new ArrayList(path);
                    newPath.add(nums[i]);
                    dfs(nums,remain-nums[i],newPath,i+1);
                }
            }
        }
    }
}