class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int lo = 0;
        int hi = 0;
        int size = Integer.MAX_VALUE;
        int sum = 0;
        while(hi < nums.length){
            sum += nums[hi++];
            while(sum >= s){
                size = Math.min(size,hi - lo);
                sum -= nums[lo++];
            }
        }
        if(size == Integer.MAX_VALUE){
            return 0;
        }
        return size;
    }
}