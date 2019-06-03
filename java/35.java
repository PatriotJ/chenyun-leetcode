class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = nums.length;
        if(l == 0){
            return 0;
        }
        int lo = 0;
        int hi = l;
        while(lo < hi){
            int mid = (lo+hi)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                lo = mid+1;
            }
            else{
                hi = mid;
            }
        }
        return lo;
    }
}