class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int tmp = 0;
        for(int i = 0; i< nums.length;i++){
            if(nums[i] == 1){
                tmp ++;
                ans = Math.max(tmp,ans);
            }else{
                tmp = 0;
            }
        }
        return ans;
        
    }
}