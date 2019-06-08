class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int slow = 0;
        int fast = 1;
        int ans = 0;
        int prev = Integer.MAX_VALUE;
        while(fast < nums.length){
            while(slow < fast && nums[fast]-nums[slow]>k){
                slow ++;
            }
            if(slow != fast && prev != nums[slow] && nums[fast] - nums[slow] == k){
                ans ++;
                prev = nums[slow];
            }
            fast ++;
        }
        return ans;
    }
}