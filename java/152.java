class Solution {
    public int maxProduct(int[] nums) {
        int l = nums.length;
        int ans = nums[0];
        int rmax = nums[0], rmin = nums[0];
        for(int i = 1; i < l;i++){
            if(nums[i] < 0){
                int tmp = rmin;
                rmin = Math.min(nums[i],nums[i] * rmax);
                rmax = Math.max(nums[i],nums[i] * tmp);
            }else{
                rmax = Math.max(nums[i],nums[i]*rmax);
                rmin = Math.min(nums[i],nums[i]*rmin);
            }
            ans = Math.max(ans,rmax);
        }
        return ans;
        
    }
}