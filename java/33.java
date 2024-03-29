class Solution {
    public int search(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length-1;
        while(lo <= hi){
            int mid = (lo + hi)/2;
            // System.out.println(mid);
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] >= nums[lo]){
                if(nums[lo] <= target && nums[mid] > target){
                    hi = mid - 1;
                }else{
                    lo = mid + 1;
                }
            }else{
                if(nums[mid] < target && target <= nums[hi]){
                    lo = mid + 1;
                }else{
                    hi = mid - 1;
                }
            }
        }
        return -1;
    }
}