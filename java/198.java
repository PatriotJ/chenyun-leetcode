class Solution {
    public int rob(int[] nums) {
        int l = nums.length;
        if(l == 0){
            return 0;
        }
        int[] dp = new int[l+1];
        dp[1] = nums[0];
        for(int i = 1;i < l;i++){
            dp[i+1] = Math.max(dp[i-1]+nums[i],dp[i]);
        }
        return dp[l];
        
    }
}