class Solution {
    public boolean search(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;
        return helper(nums,lo,hi,target);
    }
    
    public boolean helper(int[] nums,int lo,int hi,int target){
        while(lo <= hi){
            int mid = lo + (hi - lo)/2;
            if(nums[mid] == target){
                return true;
            }
            if(hi == lo){
                return false;
            }
            if(nums[mid] > nums[lo]){
                if(nums[mid] > target && nums[lo] <= target){
                    hi = mid - 1;
                }else{
                    lo = mid + 1;
                }
            }else if(nums[mid] == nums[lo]){
                return helper(nums,lo,mid,target) || helper(nums,mid+1,hi,target);
            }else{
                if(nums[mid] < target && nums[hi] >= target){
                    lo = mid + 1;
                }else{
                    hi = mid - 1;
                }
            }
        }
        return false;
    }
}