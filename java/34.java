class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0){
            return new int[]{-1,-1};
        }
        int f = first(nums,target),l = last(nums,target);
        return new int[]{f,l};
    }
    
    public int first(int[] nums,int target){
        int lo = 0;
        int hi = nums.length - 1;
        while(lo < hi){
            int mid = (lo + hi)/2;
            if(nums[mid] >  target){
                hi = mid - 1;
            }else if(nums[mid] == target){
                hi = mid;
            }else{
                lo = mid + 1;
            }
        }
        if(nums[lo] == target){
            return lo;
        }
        return -1;
    }
    public int last(int[] nums,int target){
        int lo = 0;
        int hi = nums.length-1;
        while(lo < hi){
            int mid = (lo+hi)/2 +1;
            if(nums[mid] <= target){
                lo = mid;
            }else{
                hi = mid-1;
            }
        }
        if(nums[hi] == target){
            return hi;
        }
        return -1;
    }
}