class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l = nums.length;
        int[] ans = new int[l];
        for(int i = 0; i < l;i++){
            ans[i] = 1;
        }
        
        int t1 = 1;
        int t2 = 1;
        for(int i = 0; i < l;i++){
            t1 *= nums[i];
            t2 *= nums[l-i-1];
            if(i != l-1){
                ans[i+1] *= t1;
                ans[l-i-2] *= t2;
            }
        }
        return ans;
    }
}