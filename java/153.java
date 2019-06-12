class Solution {
    public int findMin(int[] nums) {
        int l = nums.length;
        int lo = 0, hi = l - 1;
        if(l == 1){
            return nums[0];
        }
        while(lo < hi){
            int mid = (lo + hi)/2;
            if(mid == l-1){
                if(nums[mid] < nums[mid-1]){
                    return nums[mid];
                }
                else{
                    return nums[mid-1];
                }
            }
            if(mid == 0){
                if(nums[mid] < nums[l-1]){
                    return nums[mid];
                }else{
                    return nums[mid+1];
                }
            }
            if(nums[mid] < nums[mid+1] && nums[mid] < nums[mid-1]){
                return nums[mid];
            }
            if(nums[mid] > nums[hi]){
                lo = mid + 1;
            }else{
                hi = mid - 1;
            }
        }
        return nums[lo];
    }
}