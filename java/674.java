class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int ans = 1,l = nums.length;
        int tmp = 1;
        for(int i = 0;i <l-1;i++){
            if(nums[i] < nums[i+1]){
                tmp ++;
            }else{
                tmp = 1;
            }
            ans = Math.max(tmp,ans);
        }
        return Math.min(ans,l);
    }
}