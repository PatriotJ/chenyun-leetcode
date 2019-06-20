class Solution {
    public int minMoves(int[] nums) {
        // Arrays.sort(nums);
        int ans = 0;
        // for(int i = nums.length-1;i>0;i--){
        //     ans += nums[i] - nums[0];
        // }
        // return ans;
        int min = nums[0];
        for(int num:nums){
            min = Math.min(num,min);
        }
        for(int num:nums){
            ans += num-min;
        }
        return ans;
    }
}