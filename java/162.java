class Solution {
    public int findPeakElement(int[] nums) {
        int l = nums.length;
        if(l == 1){
            return 0;
        }
        int lo = 0;
        int hi = l - 1;
        while(lo < hi){
            int mid = (lo + hi)/2;
            if(mid == l - 1){
                if(nums[mid] > nums[mid-1]){
                    return mid;
                }else{
                    hi = mid - 1;
                }
            }else if(mid == 0){
                if(nums[mid] > nums[mid+1]){
                    return mid;
                }else{
                    lo = mid + 1;
                }
            }else{
                if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]){
                    return mid;
                }else if(nums[mid] < nums[mid-1]){
                    hi = mid - 1;
                }else{
                    lo = mid + 1;
                }
            }
        }
        return lo;
    }
}