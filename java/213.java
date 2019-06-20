class Solution {
    public int rob(int[] nums) {
        int l = nums.length;
        if(l == 0){
            return 0;
        }
        if(l == 1){
            return nums[0];
        }
        int dp1[] = new int[l+1];
        int dp2[] = new int[l+1];
        dp1[1] = nums[0];
        dp2[2] = nums[1];
        for(int i = 2; i < l;i++){
            dp1[i+1] = nums[i] + Math.max(dp1[i-1],dp1[i-2]);
            dp2[i+1] = nums[i] + Math.max(dp2[i-1],dp2[i-2]);
        }
        return Math.max(Math.max(dp1[l-1],dp1[l-2]),Math.max(dp2[l],dp2[l-1]));
    }
}