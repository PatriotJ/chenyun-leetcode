class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l = nums.length;
        int lo = 0;
        int hi = l - 1;
        while(lo < hi){
            int mid = (lo + hi) / 2;
            if(mid % 2 == 0){
                if(nums[mid] == nums[mid+1]){
                    lo = mid + 1;
                }else{
                    hi = mid;
                }
            }else{
                if(nums[mid] == nums[mid-1]){
                    lo = mid + 1;
                }else{
                    hi = mid;
                }
            }
        }
        return nums[lo];
    }
}