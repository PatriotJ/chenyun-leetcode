class Solution {
    Set<Integer> set = new HashSet();
    List<List<Integer>> ans = new ArrayList();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        helper(nums,0,new ArrayList<Integer>());
        return ans;
    }
    
    public void helper(int[] nums,int pos,ArrayList<Integer> path){
        ans.add(path);
        Set<Integer> h = new HashSet();
        for(int i = pos;i < nums.length;i++){
            if(!h.contains(nums[i])){
                h.add(nums[i]);
                ArrayList<Integer>tmp = new ArrayList(path);
                tmp.add(nums[i]);
                helper(nums,i+1,tmp);
            }
        }
    }
}