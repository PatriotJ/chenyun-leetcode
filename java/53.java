class Solution {
    public int maxSubArray(int[] nums) {
        int l = nums.length;
        if(l == 0){
            return 0;
        }
        int max = nums[0];
       
        int s = max;
        for(int i = 1; i < l;i++){
            s = Math.max(nums[i],nums[i]+s);
            max = Math.max(max,s);
        }
        return max;
    }
}