class Solution {
    List<List<Integer>> ans = new ArrayList();
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<Integer> Num = new ArrayList();
        for(int num:nums){
            Num.add(num);
        }
        int n = nums.length;
        backTrack(n,Num,0);
        return ans;
    }
    
    public void backTrack(int n,ArrayList<Integer>nums,int first){
        if(first == n){
            ans.add(new ArrayList(nums));
        }
        for(int i = first;i < n;i++){
            Collections.swap(nums,first,i);
            backTrack(n,nums,first+1);
            Collections.swap(nums,first,i);
        }
    }
    
}