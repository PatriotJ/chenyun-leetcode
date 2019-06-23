class Solution {
    public boolean checkPossibility(int[] nums) {
        int l = nums.length;
        int p = -1;
        for(int i = 0;i < l-1;i++){
            if(nums[i] > nums[i+1]){
                if(p != -1){
                    return false;
                }
                p = i;
            }
        }
        return p == -1 || p == 0 || p == l-2 || nums[p-1] <= nums[p+1] || nums[p] <= nums[p+2];
    }
}