class Solution {
    public int lengthOfLIS(int[] nums) {
        int l = nums.length;
        if(l == 0){
            return 0;
        }
        int[] dp = new int[l];
        dp[0] = 1;
        int max = 1;
        for(int i= 1;i<l;i++){
            int v = 0;
            for(int j = 0;j < i;j++){
                if(nums[i] > nums[j]){
                    v = Math.max(v,dp[j]);
                }
            }
            dp[i] = v + 1;
            max = Math.max(dp[i],max);
        }
        return max;
    }
}