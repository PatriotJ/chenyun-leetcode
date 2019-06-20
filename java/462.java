class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int l = nums.length;
        int ans = 0;
        for(int num:nums){
            ans += Math.abs(num - nums[l/2]);
        }
        return ans;
    }
}