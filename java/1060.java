class Solution {
    public int missingElement(int[] nums, int k) {
        int l = nums.length;
        int lo = 0;
        int hi = l-1;
        int miss = nums[hi] - nums[lo] - (hi - lo);
        if(miss < k){
            return nums[hi] + k - miss;
        }
        while(lo < hi-1){
            int mid = (lo + hi)/2;
            miss = nums[mid] - nums[lo] - (mid - lo);
            if( miss < k){
                // lo = mid;
                k -= miss;
                lo = mid;
            }else{
                hi = mid ;
            }
        }
        return nums[lo] + k;
        
    }
}