class Solution {
    public int findMin(int[] nums) {
        int l = nums.length;
        if(l == 0){
            return 0;
        }
        if(l == 1){
            return nums[0];
        }
        return helper(nums,0,l-1);
    }
    
    public int helper(int[] nums,int lo,int hi){
        int l = nums.length;
        if(lo > hi){
            return Math.min(nums[lo],nums[hi]);
        }
        int mid = (lo + hi)/2;
        if(nums[hi] < nums[mid]){
            return helper(nums,mid+1,hi);
        }
        if(mid == lo){
            return nums[lo];
        }
        int v1 = helper(nums,lo,mid);
        int v2 = helper(nums,mid+1,hi);
        return Math.min(v1,v2);
    }
}