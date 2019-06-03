class Solution {
    public int search(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length;
        while(lo < hi){
            int mid = (lo+hi)/2;
            // System.out.println(nums[mid]);
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid]>target){
                hi = mid;
            }else{
                lo = mid+1;
            }
        }
        return -1;
    }
}