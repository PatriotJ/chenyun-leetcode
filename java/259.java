class Solution {
    public int threeSumSmaller(int[] nums, int target) {
        Arrays.sort(nums);
        int l = nums.length;
        int ans = 0;
        for(int i = 0;i < l-2;i++){
            int lo = i + 1,hi = l-1;
            while(lo < hi){
                if(nums[i]+nums[lo]+nums[hi] < target){
                    
                    ans += hi - lo;
                    lo ++;
                }else{
                    hi --;
                }
            }
        }
        return ans;
    }
}