class Solution {
    Set<Integer> set = new HashSet();
    List<List<Integer>> ans = new ArrayList();
    int l;
    int[] nums;
    public List<List<Integer>> permuteUnique(int[] nums) {
        this.l = nums.length;
        this.nums = nums;
        helper(set,new ArrayList());
        return ans;
    }
    
    public void helper(Set<Integer> set,ArrayList<Integer>path){
        if(path.size() == l){
            ans.add(path);
        }else{
            HashSet<Integer>h = new HashSet();
            for(int i = 0;i <l;i++){
                if(!set.contains(i) && !h.contains(nums[i])){
                    h.add(nums[i]);
                    set.add(i);
                    ArrayList<Integer> tmp = new ArrayList(path);
                    tmp.add(nums[i]);
                    helper(set,tmp);
                    set.remove(i);
                }
            }
        }
    }
}