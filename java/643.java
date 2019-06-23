class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l = nums.length;
        int i = 0;
        double sum = 0;
        for(;i < k;i++){
            sum += nums[i];
        }
        double ans = sum/k;
        for(;i < l;i++){
            sum += nums[i] - nums[i-k];
            ans = Math.max(ans,sum/k);
        }
        return ans;
    }
}